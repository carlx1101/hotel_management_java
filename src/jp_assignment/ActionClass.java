/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jp_assignment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carl
 */
public class ActionClass {
   
    

  public void exitSoftware() {
        final JFrame parent = new JFrame();
        final int showConfirmDialog = JOptionPane.showConfirmDialog(parent, "Are you sure you want to exit ?",
                "Exit Confirmation", 1);

        switch (showConfirmDialog) {
            case 0:
          
       
            StaffLogin sl = new StaffLogin();
            sl.setVisible(true);
                break;

            case 1:
                parent.setVisible(false);
                break;

            case 2:
                parent.setVisible(false);
                break;
        }
  }
  
    public static void logoutUser() {
    
        final JFrame frame = new JFrame();
        frame.setVisible(false);
        StaffLogin sl = new StaffLogin();
        sl.setVisible(true);
        frame.dispose();
    
    }
  
       public static void returnMenu() {

        final JFrame frame = new JFrame();
        frame.setVisible(false);
        Menu mn = new Menu();
        mn.setVisible(true);
        frame.dispose();
    }
       
        public static void showInvalidMessage(String message) 
                
        {
        JOptionPane.showMessageDialog(null, message, "Action Failed", JOptionPane.ERROR_MESSAGE);

        }
    
        public static void showValidMessage(String message)
        {
  
        JOptionPane.showMessageDialog(null, message , "Action Success", JOptionPane.INFORMATION_MESSAGE);
        }
        
       
        void validatedMessage()
           {
              JOptionPane.showMessageDialog(null, "Success, Welcome Administrator", "Success: " + "Access Granted", JOptionPane.INFORMATION_MESSAGE);

           }
    
        void invalidMessage()
        {
            JOptionPane.showMessageDialog(null, "Failed Authentication. Please Try Again", "Error : " + "Authentication Failed", JOptionPane.ERROR_MESSAGE);
        }
      
      
}
