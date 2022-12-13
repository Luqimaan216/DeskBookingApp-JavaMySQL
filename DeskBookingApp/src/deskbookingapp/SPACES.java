/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskbookingapp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luqim
 */
public class SPACES {
    
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    //create a function to display all space types in jtable
    public void fillSpaces_Type_JTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[2];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                
                tableModel.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //create a function to display all spaces in jtable
    public void fillSpacesJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `spaces`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                
                tableModel.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //create a function to fill a combobox with the spaces-type id
    public void fillSpaces_Type_JComboboxSpaceType(JComboBox combobox)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                combobox.addItem(rs.getInt(1));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //creat a functiom to add a new space
    public boolean addSpace(int number, int type, int capacity)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `spaces`(`space_number`, `type`, `capacity`, `reserved`) VALUES (?, ?, ?, ?)";
        
        try {
            st = my_connection.createConnection().prepareStatement(addQuery);
            
            st.setInt(1, number);
            st.setInt(2, type);
            st.setInt(3, capacity);
            //when we add a new space
            //the reserved column will be set to no
            //the resevred column means is this room free or not
            st.setString(4, "No");
            
            return st.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    //createa function to edit the selected space
    public boolean editSpace(int number,  int type, int capacity, String isReserved)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `spaces` SET `type`=?,`capacity`=?,`reserved`=? WHERE `space_number`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(editQuery);
            
            st.setInt(1, type);
            st.setInt(2, capacity);
            st.setString(3, isReserved);
            st.setInt(4, number);
            
           return st.executeUpdate()>0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //create a function to remove the selected space
    public boolean removeSpace(int spaceNumber)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `spaces` WHERE `space_number`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(deleteQuery);
            
            st.setInt(1, spaceNumber);
            
           return st.executeUpdate()>0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
    //create a function to set a room to reserved or not
     public boolean setSpaceToReserved(int number, String isReserved)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `spaces` SET `reserved`=? WHERE `space_number`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(editQuery);
          
            st.setString(1, isReserved);
            st.setInt(2, number);
            
           return st.executeUpdate()>0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
     
     //create a function to check if a space is already reserved
      public String isSpaceReserved(int number)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "SELECT `reserved` FROM `spaces` WHERE `space_number`=?";
        
        try {
            st = my_connection.createConnection().prepareStatement(editQuery);
          
            st.setInt(1, number);
            
            rs = st.executeQuery();
            
           if(rs.next())
           {
               return rs.getString(1);
           }else
           {
               return "";
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
    
}
