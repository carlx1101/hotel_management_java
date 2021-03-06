/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jp_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Carl
 */
public class ManageBooking extends javax.swing.JFrame {

    /**
     * Creates new form ManageBooking
     */
    public ManageBooking() {
        initComponents();
    }

    
    ManageBookingSelected mbs = new ManageBookingSelected();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllBookings = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        lblTable = new javax.swing.JLabel();
        iptSearchRoomNumber = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Booking");
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(229, 238, 254));
        bgPanel.setPreferredSize(new java.awt.Dimension(1200, 650));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAllBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ", "Guest Name", "Identity Type", "Identity Number", "Contact", "Email Address", "Check In", "Check Out", "Remarks", "Days Of Stays", "Status", "ServiceTax", "Tourism Tax", "Total Price"
            }
        ));
        tblAllBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAllBookingsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAllBookings);

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 760, 470));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        bgPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 100, 40));

        lblTable.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTable.setText("Manage Booking");
        bgPanel.add(lblTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 320, 50));

        iptSearchRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptSearchRoomNumberActionPerformed(evt);
            }
        });
        iptSearchRoomNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptSearchRoomNumberKeyReleased(evt);
            }
        });
        bgPanel.add(iptSearchRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 220, 40));

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        bgPanel.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        String filePath = "C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\BookingDetails.txt";
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            DefaultTableModel model = (DefaultTableModel)tblAllBookings.getModel();
            Object[] tableLines = br.lines().toArray();
            model.setRowCount(0);
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        iptSearchRoomNumber.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblAllBookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAllBookingsMouseClicked
        try {
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel)tblAllBookings.getModel();
            int selectedRowIndex = tblAllBookings.getSelectedRow();
            iptSearchRoomNumber.setText(model.getValueAt(selectedRowIndex, 0).toString());
            String roomNumber, guestName, identityCard, identityNumber, contactNumber, emailAddress,remarks, DOS, totalPrice, status,serviceTax, tourismTax;
            roomNumber = model.getValueAt(selectedRowIndex, 0).toString();
            guestName = model.getValueAt(selectedRowIndex, 1).toString();
            identityCard = model.getValueAt(selectedRowIndex, 2).toString();
            identityNumber = model.getValueAt(selectedRowIndex, 3).toString();
            contactNumber = model.getValueAt(selectedRowIndex, 4).toString();
            emailAddress = model.getValueAt(selectedRowIndex, 5).toString();
            Date checkIn = new SimpleDateFormat("dd-MMM-yyyy").parse((String)model.getValueAt(selectedRowIndex, 6));
            Date checkOut = new SimpleDateFormat("dd-MMM-yyyy").parse((String)model.getValueAt(selectedRowIndex, 7));
            remarks = model.getValueAt(selectedRowIndex, 8).toString();
            DOS = model.getValueAt(selectedRowIndex, 9).toString();
            status = model.getValueAt(selectedRowIndex, 10).toString();
            serviceTax = model.getValueAt(selectedRowIndex, 11).toString();
            tourismTax = model.getValueAt(selectedRowIndex, 12).toString();
            
            totalPrice = model.getValueAt(selectedRowIndex, 13).toString();

            
            mbs.setVisible(true);
            mbs.pack();
            mbs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            
            mbs.iptRoomNumber.setText(roomNumber);

            mbs.iptGuestName.setText(guestName);
            mbs.iptIdentidyCardType.setSelectedItem(identityCard);
            mbs.iptIDNumber.setText(identityNumber);
            mbs.iptContact.setText(contactNumber);
            mbs.iptEmailAddress.setText(emailAddress);
            mbs.iptCID.setDate(checkIn);
            mbs.iptCOD.setDate(checkOut);
            mbs.iptRemarks.setText(remarks);
            mbs.iptDOS.setText(DOS);
            mbs.iptTotalPrice.setText(totalPrice);
            mbs.iptStatus.setText(status);
            mbs.iptServiceTax.setText(serviceTax);
            mbs.iptTourismTax.setText(tourismTax);
           
            
           
            SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
            Date collectedCheckInDate = mbs.iptCID.getDate();
            Date collectedCheckOutDate = mbs.iptCOD.getDate();
            
            
            try
            {
                
            }catch (Exception e )
            {
                
            }
        }catch (Exception e){
            
        }

        
    }//GEN-LAST:event_tblAllBookingsMouseClicked

    private void iptSearchRoomNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptSearchRoomNumberKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tblAllBookings.getModel();
        String search = iptSearchRoomNumber.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tblAllBookings.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        
                
    }//GEN-LAST:event_iptSearchRoomNumberKeyReleased

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        ActionClass rm = new ActionClass();
        rm.returnMenu();
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void iptSearchRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptSearchRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptSearchRoomNumberActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTextField iptSearchRoomNumber;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTable;
    private javax.swing.JTable tblAllBookings;
    // End of variables declaration//GEN-END:variables
}
