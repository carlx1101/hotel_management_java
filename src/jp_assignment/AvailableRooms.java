/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jp_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Carl
 */
public class AvailableRooms extends javax.swing.JFrame {

    /**
     * Creates new form AvailableRooms
     */
    
    DefaultTableModel dm;
    public AvailableRooms() {
        initComponents();
        
        CreateColumns();
    }

        private void CreateColumns()
        {
            dm = (DefaultTableModel)tblRooms.getModel();

        }
//        
        private void Populate(String roomNumber, String roomView, String roowStatus )
        {
            String[] rowData = {roomNumber,roomView,roowStatus};
            dm.addRow(rowData);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblTable = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnFilter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Available Rooms");
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(229, 238, 254));
        bgPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setToolTipText("");

        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Views", "Room Status"
            }
        ));
        jScrollPane1.setViewportView(tblRooms);

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 670, 360));

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        bgPanel.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 100, 40));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        bgPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 100, 40));

        lblTable.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTable.setText("All Rooms");
        bgPanel.add(lblTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 26, 110, 30));

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        bgPanel.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 120, 40));

        btnFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Reserved", "Occupied", "None" }));
        btnFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnFilterItemStateChanged(evt);
            }
        });
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        bgPanel.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, 40));

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
    }// </editor-fold>//GEN-END:initComponents
    
    private void filter(String query)
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        tblRooms.setRowSorter(tr);
        
        if (query!= "None")
        {
            tr.setRowFilter(RowFilter.regexFilter(query));
        }
        else 
        {
            tblRooms.setRowSorter(tr);
        }
    }
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        String filePath = "C:\\Users\\Carl\\Documents\\NetBeansProjects\\JP_Assignment\\src\\jp_assignment\\Database\\Rooms.txt";
        File file = new File(filePath);
       
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            DefaultTableModel model = (DefaultTableModel)tblRooms.getModel();
            Object[] tableLines = br.lines().toArray();
            model.setRowCount(0);
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AvailableRooms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        RoomBookingForm rmf = new RoomBookingForm();
        rmf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        Menu mn = new Menu();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnFilterItemStateChanged
        // TODO add your handling code here:
        String query = btnFilter.getSelectedItem().toString();
        
        filter(query);
    }//GEN-LAST:event_btnFilterItemStateChanged

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
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvailableRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailableRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnBook;
    private javax.swing.JComboBox<String> btnFilter;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTable;
    private javax.swing.JTable tblRooms;
    // End of variables declaration//GEN-END:variables
}
