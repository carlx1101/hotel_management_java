/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jp_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carl
 */
public class ManageBookingSelected extends javax.swing.JFrame {

    /**
     * Creates new form ManageBookingSelected
     */
    public ManageBookingSelected() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTotalPrice = new javax.swing.JLabel();
        lblRoomNumber = new javax.swing.JLabel();
        lblGuestName = new javax.swing.JLabel();
        lblIDType = new javax.swing.JLabel();
        lblIDNumber = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblCID = new javax.swing.JLabel();
        lblCOD = new javax.swing.JLabel();
        lblRemarks = new javax.swing.JLabel();
        lblDOS = new javax.swing.JLabel();
        iptRoomNumber = new javax.swing.JTextField();
        iptGuestName = new javax.swing.JTextField();
        iptIDNumber = new javax.swing.JTextField();
        iptContact = new javax.swing.JTextField();
        iptTotalPrice = new javax.swing.JTextField();
        iptRemarks = new javax.swing.JTextField();
        iptDOS = new javax.swing.JTextField();
        iptEmailAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        iptCOD = new com.toedter.calendar.JDateChooser();
        iptCID = new com.toedter.calendar.JDateChooser();
        iptIdentidyCardType = new javax.swing.JComboBox<>();
        iptStatus = new javax.swing.JTextField();
        lblRoomNumber1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblServiceTax = new javax.swing.JLabel();
        lblTourismTax = new javax.swing.JLabel();
        iptServiceTax = new javax.swing.JTextField();
        iptTourismTax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Infomation");

        jPanel1.setBackground(new java.awt.Color(229, 238, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalPrice.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(0, 102, 255));
        lblTotalPrice.setText("Total Price");
        jPanel1.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 110, -1));

        lblRoomNumber.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblRoomNumber.setForeground(new java.awt.Color(0, 102, 255));
        lblRoomNumber.setText("Room Number");
        jPanel1.add(lblRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        lblGuestName.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblGuestName.setForeground(new java.awt.Color(0, 102, 255));
        lblGuestName.setText("Guest Name");
        jPanel1.add(lblGuestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        lblIDType.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblIDType.setForeground(new java.awt.Color(0, 102, 255));
        lblIDType.setText("ID  Type");
        jPanel1.add(lblIDType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        lblIDNumber.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblIDNumber.setForeground(new java.awt.Color(0, 102, 255));
        lblIDNumber.setText("ID Number");
        jPanel1.add(lblIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        lblContact.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblContact.setForeground(new java.awt.Color(0, 102, 255));
        lblContact.setText("Contact");
        jPanel1.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        lblEmailAddress.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblEmailAddress.setForeground(new java.awt.Color(0, 102, 255));
        lblEmailAddress.setText("Email Address");
        jPanel1.add(lblEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        lblCID.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblCID.setForeground(new java.awt.Color(0, 102, 255));
        lblCID.setText("Check In Date");
        jPanel1.add(lblCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        lblCOD.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblCOD.setForeground(new java.awt.Color(0, 102, 255));
        lblCOD.setText("Check Out Date");
        jPanel1.add(lblCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        lblRemarks.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblRemarks.setForeground(new java.awt.Color(0, 102, 255));
        lblRemarks.setText("Remarks");
        jPanel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        lblDOS.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblDOS.setForeground(new java.awt.Color(0, 102, 255));
        lblDOS.setText("Days Of Stay");
        jPanel1.add(lblDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 110, 20));

        iptRoomNumber.setEditable(false);
        jPanel1.add(iptRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 180, 30));
        jPanel1.add(iptGuestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 180, 30));
        jPanel1.add(iptIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 180, 30));
        jPanel1.add(iptContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 180, 30));

        iptTotalPrice.setEditable(false);
        jPanel1.add(iptTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 180, 30));
        jPanel1.add(iptRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 180, 30));

        iptDOS.setEditable(false);
        jPanel1.add(iptDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 180, 30));
        jPanel1.add(iptEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 180, 30));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 100, 40));
        jPanel1.add(iptCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 180, 30));
        jPanel1.add(iptCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 180, 30));

        iptIdentidyCardType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identity Card (IC)", "Passport" }));
        iptIdentidyCardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptIdentidyCardTypeActionPerformed(evt);
            }
        });
        jPanel1.add(iptIdentidyCardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 180, 40));

        iptStatus.setEditable(false);
        jPanel1.add(iptStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 180, 30));

        lblRoomNumber1.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblRoomNumber1.setForeground(new java.awt.Color(0, 102, 255));
        lblRoomNumber1.setText("Status ");
        jPanel1.add(lblRoomNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        btnDelete.setText("Remove");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 110, 40));

        lblServiceTax.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblServiceTax.setForeground(new java.awt.Color(0, 102, 255));
        lblServiceTax.setText("Service Tax");
        jPanel1.add(lblServiceTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 110, -1));

        lblTourismTax.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblTourismTax.setForeground(new java.awt.Color(0, 102, 255));
        lblTourismTax.setText("Tourism Tax");
        jPanel1.add(lblTourismTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 110, -1));

        iptServiceTax.setEditable(false);
        jPanel1.add(iptServiceTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 180, 30));

        iptTourismTax.setEditable(false);
        jPanel1.add(iptTourismTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        
        try
        {

            String searchNumber = iptRoomNumber.getText();
            BufferedReader brBook = new BufferedReader(new FileReader("C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\BookingDetails.txt"));
            String record;

            ArrayList<String> tempArray = new ArrayList<>();
            while((record = brBook.readLine()) != null)
            {
                String[] row;
                row = record.split(",");
                if(row[0].equals(searchNumber))
                {
                    tempArray.remove(row[0] + "," + row[1] + "," + row[2] + "," + row[3] + "," + row[4] + "," + row[5] + "," + row[6] + "," + row[7] + "," + row[8] + "," + row[9]+ ","+ row[10]+ ","+ row[11]+ ","+ row[12]);
                }
                else
                {
                    tempArray.add(record);
                }
            }
            brBook.close();

            PrintWriter pwBook = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\BookingDetails.txt")));
            for(String line:tempArray)
            {
                pwBook.println(line);
            }
            pwBook.close();

        }catch(Exception e )
        {

        }
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        String guestName, identityNumber, contactNumber, emailAddress, identidyCardType,roomNumber, addtionalRemarks, status, serviceTax, tourismTax ;
        guestName = iptGuestName.getText();
        identidyCardType = iptIdentidyCardType.getSelectedItem().toString();
        identityNumber = iptIDNumber.getText();
        contactNumber = iptContact.getText();
        emailAddress = iptEmailAddress.getText();
      
        
//      Get Data - Room Details
        roomNumber = iptRoomNumber.getText();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        Date collectedCheckInDate = iptCID.getDate();
        Date collectedCheckOutDate = iptCOD.getDate();
        addtionalRemarks = iptRemarks.getText();
        
//      Get Date - Payment Detail 
        String dayOfStay, totalPrice; 
        dayOfStay = iptDOS.getText();
        totalPrice = iptTotalPrice.getText();
        status = iptStatus.getText();
        tourismTax = iptTourismTax.getText();
        serviceTax = iptServiceTax.getText();
        
         BufferedWriter bw;
        
        try {
            
            String checkInDate = df.format(collectedCheckInDate);
            String checkOutDate = df.format(collectedCheckOutDate);
            
            bw = new BufferedWriter(new FileWriter("C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\BookingDetails.txt", true));
            bw.write(roomNumber + "," + guestName + "," + identidyCardType + "," + identityNumber+ "," + contactNumber + "," + emailAddress + "," + checkInDate + "," + checkOutDate +  "," + addtionalRemarks + "," + dayOfStay + "," + status + "," + serviceTax + "," + tourismTax + "," + totalPrice + "\n");
            
            ActionClass ac = new ActionClass();
            ac.showValidMessage("Booking Detail Updated");

                bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ManageBookingSelected.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void iptIdentidyCardTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptIdentidyCardTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptIdentidyCardTypeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try
        {

            String searchNumber = iptRoomNumber.getText();
            BufferedReader brBook = new BufferedReader(new FileReader("C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\BookingDetails.txt"));
            String record;

            ArrayList<String> tempArray = new ArrayList<>();
            while((record = brBook.readLine()) != null)
            {
                String[] row;
                row = record.split(",");
                if(row[0].equals(searchNumber))
                {
                    tempArray.remove(row[0] + "," + row[1] + "," + row[2] + "," 
                    + row[3] + "," + row[4] + "," + row[5] + "," + row[6] + "," + row[7] 
                    + "," + row[8] + "," + row[9]+ ","+ row[10]);
                }
                else
                {
                    tempArray.add(record);
                }
            }
            brBook.close();

            PrintWriter pwBook = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\BookingDetails.txt")));
            for(String line:tempArray)
            {
                pwBook.println(line);
            }
            pwBook.close();
            
            ActionClass ac = new ActionClass();
            ac.showValidMessage("Booking has been cancelled !");

        }catch(Exception e )
        {

        }

    
        String searchRoomNumber, roomStatus ,filePath, line;
        searchRoomNumber = iptRoomNumber.getText();
        roomStatus = "Available";
        filePath = "C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\Rooms.txt";

        ArrayList<String> tempArray = new ArrayList<>();
        try
        {
            try (FileReader fr = new FileReader(filePath) )
            {
                Scanner reader = new Scanner(fr);
                String[] lineArr;

                while ((line = reader.nextLine()) != null)
                {
                    lineArr = line.split(",");
                    if (lineArr[0].equals(searchRoomNumber))
                    {
                        tempArray.add
                        (
                            lineArr[0] + "," +
                            lineArr[1] + "," +
                            roomStatus);

                    }
                    else
                    {
                        tempArray.add(line);

                    }
                    fr.close();
                }
            }
            catch (Exception e)
            {

            }
        }catch (Exception e)
        {

        }

        try
        {
            try (PrintWriter pr = new PrintWriter(filePath))
            {
                for (String str : tempArray )
                {
                    pr.println(str);
                }
                pr.close();
            }
        }
        catch (Exception e)
        {

        
        
         ActionClass ac = new ActionClass();
            ac.showValidMessage("Booking has been cancelled ! Room is Available");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageBookingSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBookingSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBookingSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBookingSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBookingSelected().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    public com.toedter.calendar.JDateChooser iptCID;
    public com.toedter.calendar.JDateChooser iptCOD;
    public javax.swing.JTextField iptContact;
    public javax.swing.JTextField iptDOS;
    public javax.swing.JTextField iptEmailAddress;
    public javax.swing.JTextField iptGuestName;
    public javax.swing.JTextField iptIDNumber;
    public javax.swing.JComboBox<String> iptIdentidyCardType;
    public javax.swing.JTextField iptRemarks;
    public javax.swing.JTextField iptRoomNumber;
    public javax.swing.JTextField iptServiceTax;
    public javax.swing.JTextField iptStatus;
    public javax.swing.JTextField iptTotalPrice;
    public javax.swing.JTextField iptTourismTax;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblCOD;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOS;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblGuestName;
    private javax.swing.JLabel lblIDNumber;
    private javax.swing.JLabel lblIDType;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblRoomNumber;
    private javax.swing.JLabel lblRoomNumber1;
    private javax.swing.JLabel lblServiceTax;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTourismTax;
    // End of variables declaration//GEN-END:variables
}
