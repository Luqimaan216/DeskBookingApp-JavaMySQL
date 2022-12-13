
package deskbookingapp;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luqim
 */
public class RESERVATION {
    
    //in the reservation table we need to add two foreign keys
    //1 for the client
    //-> alter TABLE reservations ADD CONSTRAINT fk_client_id FOREIGN KEY (client_id) references clients(id) on DELETE CASCADE
    //1 for the space
    //-> alter TABLE reservations ADD CONSTRAINT fk_space_number FOREIGN KEY (space_number) references spaces(space_number) on DELETE CASCADE
    //and add another foreign key between the table type and space
    //alter TABLE spaces ADD CONSTRAINT fk_type_id FOREIGN KEY (type) references type(id) on DELETE CASCADE
    
    
    
    //fixes needed
    //1. when adding new reservation the room associated with it should be set to reserved = YES
    //   and when deleting the reservation the it should be set to reserved = NO
    //2. when adding a new reservation the room must be checked to ensure it isnt already reserved
    //3. check if the date in > the current date
    //4. check that the date out is > than date in
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    SPACES space = new SPACES();
    
    
    //creat a function to add a new reservation
    public boolean addReservation(int client_id, int space_number, String dateIn, String dateOut)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `reservations`(`client_id`, `space_number`, `date_time_in`, `date_time_out`) VALUES (?,?,?,?)";
        
        try {
            st = my_connection.createConnection().prepareStatement(addQuery);
            
            st.setInt(1, client_id);
            st.setInt(2, space_number);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            
            if(space.isSpaceReserved(space_number).equals("No"))
            {
               if (st.executeUpdate() > 0)
               {
                    space.setSpaceToReserved(space_number, "Yes");
                    return true;
               }else{
                    return false;
               } 
            }else{
                JOptionPane.showMessageDialog(null, "This Space Is ALready Reserved", "Space Reserved", JOptionPane.WARNING_MESSAGE);

                return false;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    
    
    
    //createa function to edit the selected reservation
    public boolean editReservation(int reservation_id, int client_id, int space_number, String dateIn, String dateOut)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `reservations` SET `client_id`=?,`space_number`=?,`date_time_in`=?,`date_time_out`=? WHERE `id`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(editQuery);
            
            st.setInt(1, client_id);
            st.setInt(2, space_number);
            st.setString(3, dateIn);
            st.setString(4, dateOut);
            st.setInt(5, reservation_id);
            
           return st.executeUpdate()>0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //create a function to remove the selected reservation
    public boolean removeReservation(int reservation_id)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `reservations` WHERE `id`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, reservation_id);
            
            //get space number before deleting
            int space_number = getSpaceNumberFromReservation(reservation_id);
            
           if (st.executeUpdate() > 0)
            {
                space.setSpaceToReserved(space_number, "No");
                return true;
            }else{
                return false;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    // create function to display all reservation is jtable
    public void fillReservationsJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `reservations`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                
                tableModel.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //create a function to get the space number from a reservation
    public int getSpaceNumberFromReservation(int reservationID)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT `space_number` FROM `reservations` WHERE `id`=?";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            ps.setInt(1, reservationID);

            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                return rs.getInt(1);
            }else
            {
                return 0;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
