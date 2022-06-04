/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.project;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        main = new javax.swing.JPanel();
        projectmadeby = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        Side = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        HomeLabelText = new javax.swing.JLabel();
        ChatLabelText = new javax.swing.JLabel();
        ChatRoomLabelText = new javax.swing.JLabel();
        ContactsLabelText = new javax.swing.JLabel();
        ChatLabelIcon = new javax.swing.JLabel();
        ChatRoomLabelIcon = new javax.swing.JLabel();
        cantactsLabelIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marzi");
        setName("FRAME"); // NOI18N

        main.setBackground(new java.awt.Color(238, 132, 91));

        projectmadeby.setBackground(new java.awt.Color(0, 0, 0));
        projectmadeby.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        projectmadeby.setForeground(new java.awt.Color(240, 240, 240));
        projectmadeby.setText("PROJECT MADE BY");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("CHAT APPLICATION");

        name1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(200, 63, 38));
        name1.setText("Muhammad Anas Shafique");

        name2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        name2.setForeground(new java.awt.Color(200, 63, 38));
        name2.setText("Ahmed Mujtaba Butt");

        name3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        name3.setForeground(new java.awt.Color(200, 63, 38));
        name3.setText("Muneeb Aslam");

        name4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        name4.setForeground(new java.awt.Color(200, 63, 38));
        name4.setText("Muhammad Razi-ur-Rehman");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(projectmadeby))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1)
                            .addComponent(name2)
                            .addComponent(name3)
                            .addComponent(name4))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectmadeby, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name4)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        Side.setBackground(new java.awt.Color(200, 63, 38));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CNlogo.png"))); // NOI18N

        HomeLabelText.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        HomeLabelText.setText("HOME");
        HomeLabelText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ChatLabelText.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        ChatLabelText.setText("CHAT");
        ChatLabelText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChatLabelText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChatLabelTextMouseClicked(evt);
            }
        });

        ChatRoomLabelText.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        ChatRoomLabelText.setText("CHAT ROOM");
        ChatRoomLabelText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChatRoomLabelText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChatRoomLabelTextMouseClicked(evt);
            }
        });

        ContactsLabelText.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        ContactsLabelText.setText("CONTACTS");
        ContactsLabelText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContactsLabelText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactsLabelTextMouseClicked(evt);
            }
        });

        ChatLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Chat icon.png"))); // NOI18N
        ChatLabelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChatLabelIconMouseClicked(evt);
            }
        });

        ChatRoomLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chat room icon.png"))); // NOI18N

        cantactsLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contacts icon.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home cn project.png"))); // NOI18N

        javax.swing.GroupLayout SideLayout = new javax.swing.GroupLayout(Side);
        Side.setLayout(SideLayout);
        SideLayout.setHorizontalGroup(
            SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideLayout.createSequentialGroup()
                .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ContactsLabelText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantactsLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SideLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChatLabelText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HomeLabelText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChatLabelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SideLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ChatRoomLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChatRoomLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SideLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        SideLayout.setVerticalGroup(
            SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SideLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HomeLabelText)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ChatLabelText)
                            .addComponent(ChatLabelIcon))
                        .addGap(59, 59, 59)
                        .addComponent(ChatRoomLabelText)
                        .addGap(86, 86, 86)
                        .addComponent(ContactsLabelText)
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(SideLayout.createSequentialGroup()
                        .addComponent(ChatRoomLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(cantactsLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 207, Short.MAX_VALUE)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 558, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChatRoomLabelTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChatRoomLabelTextMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ChatRoomLabelTextMouseClicked

    private void ChatLabelTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChatLabelTextMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new Chat().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChatLabelTextMouseClicked

    private void ChatLabelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChatLabelIconMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new Chat().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChatLabelIconMouseClicked

    private void ContactsLabelTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactsLabelTextMouseClicked
        // TODO add your handling code here:
      this.setVisible(false);
      new contact().setVisible(true); 
    }//GEN-LAST:event_ContactsLabelTextMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChatLabelIcon;
    private javax.swing.JLabel ChatLabelText;
    private javax.swing.JLabel ChatRoomLabelIcon;
    private javax.swing.JLabel ChatRoomLabelText;
    private javax.swing.JLabel ContactsLabelText;
    private javax.swing.JLabel HomeLabelText;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Side;
    private javax.swing.JLabel cantactsLabelIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel main;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel projectmadeby;
    // End of variables declaration//GEN-END:variables
}
