/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jp_assignment;

/**
 *
 * @author Carl
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        bgPanel = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        dasda = new javax.swing.JButton();
        lblBooking = new javax.swing.JButton();
        btnCheckInOut = new javax.swing.JButton();
        lblManageRecord = new javax.swing.JLabel();
        lblBookRoom = new javax.swing.JLabel();
        lblCheckInAndOut = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAllRecord = new javax.swing.JButton();
        lblAllTransactions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(229, 238, 254));
        bgPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jp_assignment/Assets/logo.png"))); // NOI18N
        bgPanel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 33)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(21, 57, 203));
        lblTitle.setText("Shangri-la Resort (APU) Sdn. Bhd.");
        bgPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 630, 70));

        dasda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jp_assignment/Assets/searchBtnImage.png"))); // NOI18N
        dasda.setMaximumSize(new java.awt.Dimension(203, 129));
        dasda.setPreferredSize(new java.awt.Dimension(203, 129));
        dasda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dasdaActionPerformed(evt);
            }
        });
        bgPanel.add(dasda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 170, -1));

        lblBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jp_assignment/Assets/bookingBtnImage.png"))); // NOI18N
        lblBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBookingActionPerformed(evt);
            }
        });
        bgPanel.add(lblBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 130));

        btnCheckInOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jp_assignment/Assets/checkinBtnImage.jpg"))); // NOI18N
        btnCheckInOut.setMaximumSize(new java.awt.Dimension(203, 129));
        btnCheckInOut.setPreferredSize(new java.awt.Dimension(203, 129));
        btnCheckInOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInOutActionPerformed(evt);
            }
        });
        bgPanel.add(btnCheckInOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 170, 130));

        lblManageRecord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblManageRecord.setText("Manage Bookings");
        bgPanel.add(lblManageRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        lblBookRoom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBookRoom.setText("Book");
        bgPanel.add(lblBookRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        lblCheckInAndOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCheckInAndOut.setText("Check In / Out");
        bgPanel.add(lblCheckInAndOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        bgPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 90, 40));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        bgPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 90, 40));

        btnAllRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jp_assignment/Assets/searchBtnImage.png"))); // NOI18N
        btnAllRecord.setMaximumSize(new java.awt.Dimension(203, 129));
        btnAllRecord.setPreferredSize(new java.awt.Dimension(203, 129));
        btnAllRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllRecordActionPerformed(evt);
            }
        });
        bgPanel.add(btnAllRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 170, -1));

        lblAllTransactions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAllTransactions.setText("All Transactions");
        bgPanel.add(lblAllTransactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBookingActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AvailableRooms ar = new AvailableRooms();
        ar.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBookingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        ActionClass ac = new ActionClass();
        ac.exitSoftware();    
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCheckInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CheckInAndOut ciao = new CheckInAndOut();
        ciao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCheckInOutActionPerformed

    private void dasdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dasdaActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        ManageBooking mb = new ManageBooking();
        mb.setVisible(true);
        dispose();
    }//GEN-LAST:event_dasdaActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAllRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllRecordActionPerformed
        // TODO add your handling code here:
     
        this.setVisible(false);
        AllTransactions at = new AllTransactions();
        at.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAllRecordActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnAllRecord;
    private javax.swing.JButton btnCheckInOut;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton dasda;
    private javax.swing.JLabel lblAllTransactions;
    private javax.swing.JLabel lblBookRoom;
    private javax.swing.JButton lblBooking;
    private javax.swing.JLabel lblCheckInAndOut;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblManageRecord;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
