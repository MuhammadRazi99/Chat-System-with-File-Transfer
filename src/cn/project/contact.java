/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class contact extends javax.swing.JFrame {

    /**
     * Creates new form contact
     */
    private Connection conn;
    private PreparedStatement stmt;

    public contact() {
        initComponents();
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-U3DPH2O:1433;databaseName=Chat-System-with-File-Transfer;encrypt=true;trustServerCertificate=true;");
        } catch (SQLException ex) {
            Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        showContacts();
    }
    public String hostname = "";
    public String IP = "";

    public boolean checkIPAddress(String IP) {
        String[] IPString = IP.split("\\.");
        if (IPString.length != 4) {
            return false;
        }
        int i = 0;
        while (i <= 3) {
            try {
                int IPv4 = Integer.parseInt(IPString[i]);
                if ((IPv4 < 0) || (IPv4 > 255)) {
                    return false;
                }
            } catch (NumberFormatException ex) {
                Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
        }
        return true;
    }

    public void showContacts() {
        try {
            stmt = conn.prepareStatement("select * from Contacts");
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) ContactsTable.getModel();
            String row[][] = new String[8][2];
            int i = 0;
            while (rs.next()) {
                int j = 0;
                row[i][j++] = rs.getString("IP");
                row[i][j++] = rs.getString("hostname");
                model.addRow(row[i]);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side = new javax.swing.JPanel();
        backLabelIcon = new javax.swing.JLabel();
        Jlabel1 = new javax.swing.JLabel();
        BackTextLabel = new javax.swing.JLabel();
        Jlabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hostnametext = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        IPtext = new javax.swing.JTextPane();
        AddButton = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ContactsTable = new javax.swing.JTable();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side.setBackground(new java.awt.Color(200, 63, 38));

        backLabelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelIconMouseClicked(evt);
            }
        });

        Jlabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Jlabel1.setText("CONTACTS");
        Jlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlabel1MouseClicked(evt);
            }
        });

        BackTextLabel.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        BackTextLabel.setText("BACK");
        BackTextLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackTextLabelMouseClicked(evt);
            }
        });

        Jlabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Jlabel2.setText("HOST NAME:");
        Jlabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("IPv4:");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(hostnametext);

        jScrollPane2.setViewportView(IPtext);

        AddButton.setBackground(new java.awt.Color(200, 63, 38));
        AddButton.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        AddButton.setText("Add New Contact");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(sideLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backLabelIcon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BackTextLabel)
                                .addGroup(sideLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(AddButton))
                                .addGroup(sideLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sideLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(Jlabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sideLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Jlabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(Jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(AddButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.setBackground(new java.awt.Color(238, 132, 91));

        ContactsTable.setBackground(new java.awt.Color(200, 63, 38));
        ContactsTable.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        ContactsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IPv4 Address", "Hostname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ContactsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ContactsTable);

        UpdateButton.setBackground(new java.awt.Color(200, 63, 38));
        UpdateButton.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        UpdateButton.setText("Update Contact");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(200, 63, 38));
        DeleteButton.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        DeleteButton.setText("Delete Contact");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(UpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel1MouseClicked
        // TODO add your handling code here:
//        this.setVisible(false);
//        new Home().setVisible(true);
    }//GEN-LAST:event_Jlabel1MouseClicked

    private void BackTextLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackTextLabelMouseClicked
        // TODO add your handling code here:
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_BackTextLabelMouseClicked

    private void Jlabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jlabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void backLabelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelIconMouseClicked
        // TODO add your handling code here:
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backLabelIconMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ContactsTable.getModel();
        IP = IPtext.getText();
        hostname = hostnametext.getText();

        if (!checkIPAddress(IP)) {
            JOptionPane.showMessageDialog(this, "Invalid IP Address!");
        } else {
            try {
                stmt = conn.prepareStatement("insert into Contacts values ('" + IP + "','" + hostname + "')");
                stmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        String row[] = {IP, hostname};
        model.addRow(row);
        IPtext.setText(null);
        hostnametext.setText(null);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ContactsTable.getModel();
        String IP = (String) model.getValueAt(ContactsTable.getSelectedRow(), 0);
        String hostname = (String) model.getValueAt(ContactsTable.getSelectedRow(), 1);
        this.IP = IPtext.getText();
        this.hostname = hostnametext.getText();

        if (!checkIPAddress(IP)) {
            JOptionPane.showMessageDialog(this, "Invalid IP Address!");
        } else {
            try {
                stmt = conn.prepareStatement("update Contacts set IP='" + this.IP + "', hostname='" + this.hostname + "' where IP='" + IP + "' and hostname='" + hostname + "'");
                stmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        model.setValueAt(this.IP, ContactsTable.getSelectedRow(), 0);
        model.setValueAt(this.hostname, ContactsTable.getSelectedRow(), 1);
        IPtext.setText(null);
        hostnametext.setText(null);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ContactsTable.getModel();
        IP = (String) model.getValueAt(ContactsTable.getSelectedRow(), 0);
        hostname = (String) model.getValueAt(ContactsTable.getSelectedRow(), 1);

        try {
            stmt = conn.prepareStatement("delete from Contacts where IP = '" + IP + "' and hostname = '" + hostname + "'");
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
        }

        model.removeRow(ContactsTable.getSelectedRow());
        IPtext.setText(null);
        hostnametext.setText(null);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ContactsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ContactsTable.getModel();
        IP = (String) model.getValueAt(ContactsTable.getSelectedRow(), 0);
        hostname = (String) model.getValueAt(ContactsTable.getSelectedRow(), 1);
        IPtext.setText(IP);
        hostnametext.setText(hostname);
    }//GEN-LAST:event_ContactsTableMouseClicked

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
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel BackTextLabel;
    private javax.swing.JTable ContactsTable;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextPane IPtext;
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel backLabelIcon;
    private javax.swing.JTextPane hostnametext;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel main;
    private javax.swing.JPanel side;
    // End of variables declaration//GEN-END:variables
}
