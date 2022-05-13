/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jp_assignment;

import java.io.File;
import javax.swing.*;
/**
 *
 * @author Carl
 */
public class SplashScreen extends javax.swing.JFrame {
    

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
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
        systemTitle = new javax.swing.JLabel();
        loadingValue = new javax.swing.JLabel();
        loadingLabel = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bgPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        systemTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        systemTitle.setForeground(new java.awt.Color(255, 255, 255));
        systemTitle.setText("Resort Management & Booking System ");
        bgPanel.add(systemTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        loadingValue.setForeground(new java.awt.Color(255, 255, 255));
        loadingValue.setText("0 %");
        bgPanel.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, -1, -1));

        loadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        loadingLabel.setText("Loading");
        bgPanel.add(loadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jp_assignment/Assets/bgImage.jpg"))); // NOI18N
        bgImage.setText("jLabel1");
        bgPanel.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 470));
        bgPanel.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 900, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SplashScreen().setVisible(true);
//            }
//        });

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                sp.loadingValue.setText(i + "%");
                if (i == 10) {
                    sp.loadingLabel.setText("Turning on Modules...");
                    
                }
                if (i == 30) {
                    sp.loadingLabel.setText("Configuring Modules...");
                }
                if (i == 50) {
                    sp.loadingLabel.setText("Connecting to Database...");
                }
                if (i == 70) {
                    sp.loadingLabel.setText("Updating plugins...");
                }
                if (i == 80) {
                    sp.loadingLabel.setText("Lauching Applicaiton...");
                }
                sp.loadingBar.setValue(i);
                
                if (i == 100)
                {
                    sp.dispose();

                    StaffLogin sl = new StaffLogin();
                    sl.setVisible(true);
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JLabel loadingValue;
    private javax.swing.JLabel systemTitle;
    // End of variables declaration//GEN-END:variables
}
