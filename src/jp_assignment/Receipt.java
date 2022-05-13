/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jp_assignment;

/**
 *
 * @author Carl
 */
public class Receipt extends javax.swing.JFrame {

    /**
     * Creates new form Receipt
     */
    public Receipt() {
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
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblRoomInformation = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblGuestName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblCID = new javax.swing.JLabel();
        lblCOD = new javax.swing.JLabel();
        lblRemarks = new javax.swing.JLabel();
        lblDOS = new javax.swing.JLabel();
        iptRoomNumber = new javax.swing.JTextField();
        iptGuestName = new javax.swing.JTextField();
        iptCOD = new javax.swing.JTextField();
        iptTotalPrice = new javax.swing.JTextField();
        iptRemarks = new javax.swing.JTextField();
        iptDOS = new javax.swing.JTextField();
        iptEmailAddress = new javax.swing.JTextField();
        lblRoomNumber2 = new javax.swing.JLabel();
        lblRoomInformation1 = new javax.swing.JLabel();
        lblRoomInformation2 = new javax.swing.JLabel();
        iptTourismTax = new javax.swing.JTextField();
        lblTotalPrice2 = new javax.swing.JLabel();
        lblTotalPrice3 = new javax.swing.JLabel();
        iptPricePerNight = new javax.swing.JTextField();
        iptContactNumber = new javax.swing.JTextField();
        iptCID = new javax.swing.JTextField();
        lblTotalPrice4 = new javax.swing.JLabel();
        lblTotalPrice5 = new javax.swing.JLabel();
        iptServiceTax = new javax.swing.JTextField();
        lblRoomInformation3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 690));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jp_assignment/Assets/logo.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 130));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 33)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(21, 57, 203));
        lblTitle.setText("Shangri-la Resort (APU) Sdn. Bhd.");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 630, 70));

        lblRoomInformation.setFont(new java.awt.Font("Segoe UI Historic", 1, 22)); // NOI18N
        lblRoomInformation.setForeground(new java.awt.Color(0, 102, 255));
        lblRoomInformation.setText("Room Information");
        jPanel1.add(lblRoomInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 40));

        lblTotalPrice.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblTotalPrice.setText("Total Price");
        jPanel1.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 110, -1));

        lblGuestName.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblGuestName.setText("Guest Name");
        jPanel1.add(lblGuestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 130, -1));

        lblContact.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblContact.setText("Contact Number");
        jPanel1.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        lblEmailAddress.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblEmailAddress.setText("Email Address");
        jPanel1.add(lblEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        lblCID.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblCID.setText("Check In Date");
        jPanel1.add(lblCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        lblCOD.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblCOD.setText("Check Out Date");
        jPanel1.add(lblCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        lblRemarks.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblRemarks.setText("Additional Remarks");
        jPanel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        lblDOS.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblDOS.setText("Days Of Stay");
        jPanel1.add(lblDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 110, 20));

        iptRoomNumber.setEditable(false);
        iptRoomNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptRoomNumber.setBorder(null);
        jPanel1.add(iptRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 30));

        iptGuestName.setEditable(false);
        iptGuestName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptGuestName.setBorder(null);
        jPanel1.add(iptGuestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 180, 30));

        iptCOD.setEditable(false);
        iptCOD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptCOD.setBorder(null);
        jPanel1.add(iptCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 30));

        iptTotalPrice.setEditable(false);
        iptTotalPrice.setBorder(null);
        jPanel1.add(iptTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 220, 30));

        iptRemarks.setEditable(false);
        iptRemarks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptRemarks.setBorder(null);
        jPanel1.add(iptRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 220, 30));

        iptDOS.setEditable(false);
        iptDOS.setBorder(null);
        jPanel1.add(iptDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 220, 30));

        iptEmailAddress.setEditable(false);
        iptEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptEmailAddress.setBorder(null);
        jPanel1.add(iptEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 180, 30));

        lblRoomNumber2.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblRoomNumber2.setText("Room Number");
        jPanel1.add(lblRoomNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        lblRoomInformation1.setFont(new java.awt.Font("Segoe UI Historic", 1, 22)); // NOI18N
        lblRoomInformation1.setForeground(new java.awt.Color(0, 102, 255));
        lblRoomInformation1.setText("Billing Information");
        jPanel1.add(lblRoomInformation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 220, 40));

        lblRoomInformation2.setFont(new java.awt.Font("Segoe UI Historic", 1, 22)); // NOI18N
        lblRoomInformation2.setForeground(new java.awt.Color(0, 102, 255));
        lblRoomInformation2.setText("Guest Information");
        jPanel1.add(lblRoomInformation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 220, 40));

        iptTourismTax.setEditable(false);
        iptTourismTax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptTourismTax.setBorder(null);
        jPanel1.add(iptTourismTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 180, 30));

        lblTotalPrice2.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblTotalPrice2.setText("Price Per Night");
        jPanel1.add(lblTotalPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 120, 30));

        lblTotalPrice3.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblTotalPrice3.setText("Service Tax");
        jPanel1.add(lblTotalPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 120, 30));

        iptPricePerNight.setEditable(false);
        iptPricePerNight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptPricePerNight.setBorder(null);
        jPanel1.add(iptPricePerNight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 180, 30));

        iptContactNumber.setEditable(false);
        iptContactNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptContactNumber.setBorder(null);
        jPanel1.add(iptContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 180, 30));

        iptCID.setEditable(false);
        iptCID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptCID.setBorder(null);
        jPanel1.add(iptCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 210, 30));

        lblTotalPrice4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        lblTotalPrice4.setForeground(new java.awt.Color(0, 102, 255));
        lblTotalPrice4.setText("Thank You For Using Our Services !");
        jPanel1.add(lblTotalPrice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 400, 30));

        lblTotalPrice5.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        lblTotalPrice5.setText("Tourism Tax");
        jPanel1.add(lblTotalPrice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 120, 30));

        iptServiceTax.setEditable(false);
        iptServiceTax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iptServiceTax.setBorder(null);
        jPanel1.add(iptServiceTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 180, 30));

        lblRoomInformation3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRoomInformation3.setForeground(new java.awt.Color(0, 102, 255));
        lblRoomInformation3.setText("Invoice");
        jPanel1.add(lblRoomInformation3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField iptCID;
    public javax.swing.JTextField iptCOD;
    public javax.swing.JTextField iptContactNumber;
    public javax.swing.JTextField iptDOS;
    public javax.swing.JTextField iptEmailAddress;
    public javax.swing.JTextField iptGuestName;
    public javax.swing.JTextField iptPricePerNight;
    public javax.swing.JTextField iptRemarks;
    public javax.swing.JTextField iptRoomNumber;
    public javax.swing.JTextField iptServiceTax;
    public javax.swing.JTextField iptTotalPrice;
    public javax.swing.JTextField iptTourismTax;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblCOD;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOS;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblGuestName;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblRoomInformation;
    private javax.swing.JLabel lblRoomInformation1;
    private javax.swing.JLabel lblRoomInformation2;
    private javax.swing.JLabel lblRoomInformation3;
    private javax.swing.JLabel lblRoomNumber2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTotalPrice2;
    private javax.swing.JLabel lblTotalPrice3;
    private javax.swing.JLabel lblTotalPrice4;
    private javax.swing.JLabel lblTotalPrice5;
    // End of variables declaration//GEN-END:variables
}