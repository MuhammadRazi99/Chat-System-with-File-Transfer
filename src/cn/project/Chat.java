/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.project;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class Chat extends javax.swing.JFrame {

    /**
     * Creates new form Chat
     */
    public Chat() {
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

        main = new javax.swing.JScrollPane();
        Jtab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        TextMessage = new javax.swing.JTextField();
        sendIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BackIconLabel = new javax.swing.JLabel();
        BackTextLabel = new javax.swing.JLabel();
        ClientName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHAT");
        setPreferredSize(new java.awt.Dimension(800, 571));

        main.setBackground(new java.awt.Color(238, 132, 91));
        main.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        main.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Jtab.setBackground(new java.awt.Color(200, 63, 38));
        Jtab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Jtab.setToolTipText("");
        Jtab.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Jtab.setPreferredSize(new java.awt.Dimension(800, 578));
        Jtab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtabMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(238, 132, 91));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        TextMessage.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TextMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextMessageKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextMessageKeyTyped(evt);
            }
        });

        sendIcon.setIcon(new javax.swing.ImageIcon("D:\\Razi\\Java\\Chat-System-with-File-Transfer\\src\\Images\\send icon 1.png")); // NOI18N
        sendIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(sendIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(410, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );

        Jtab.addTab("Client Name 1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(238, 132, 91));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        Jtab.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(238, 132, 91));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        Jtab.addTab("tab4", jPanel4);

        main.setViewportView(Jtab);

        BackIconLabel.setIcon(new javax.swing.ImageIcon("D:\\Razi\\Java\\Chat-System-with-File-Transfer\\src\\Images\\back arrow.png")); // NOI18N
        BackIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIconLabelMouseClicked(evt);
            }
        });

        BackTextLabel.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        BackTextLabel.setText("BACK");
        BackTextLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackTextLabelMouseClicked(evt);
            }
        });

        ClientName.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        ClientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientName.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackIconLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackTextLabel)
                .addGap(208, 208, 208)
                .addComponent(ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtabMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JtabMouseClicked

    private void BackIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_BackIconLabelMouseClicked

    private void BackTextLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackTextLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_BackTextLabelMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
//       ClientName.setText();

    }//GEN-LAST:event_jPanel2MouseClicked
public void UpwardText(){
    JLabel label1=new JLabel();
    label1.setText(TextMessage.getText());
    label1.setLocation(6, 491);
        System.out.println(TextMessage.getText());
        TextMessage.setText("");
}
    private void sendIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendIconMouseClicked
        // TODO add your handling code here:
//        new JLabel().setText(TextMessage.getText());
//        System.out.println(TextMessage.getLocation());
//        System.out.println(TextMessage.getText());
//        TextMessage.setText("");
            JLabel label1=new JLabel();
    label1.setText(TextMessage.getText());
    label1.setLocation(6, 491);
        System.out.println(TextMessage.getText());
        TextMessage.setText("");
    }//GEN-LAST:event_sendIconMouseClicked

    private void TextMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMessageKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new JLabel().setText(TextMessage.getText());
        
        System.out.println(TextMessage.getText());
        TextMessage.setText("");
        }
    }//GEN-LAST:event_TextMessageKeyTyped

    private void TextMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMessageKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            new JLabel().setText(TextMessage.getText());
        System.out.println(TextMessage.getText());
        TextMessage.setText("");
        }
    }//GEN-LAST:event_TextMessageKeyPressed

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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIconLabel;
    private javax.swing.JLabel BackTextLabel;
    private javax.swing.JLabel ClientName;
    private javax.swing.JTabbedPane Jtab;
    private javax.swing.JTextField TextMessage;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane main;
    private javax.swing.JLabel sendIcon;
    // End of variables declaration//GEN-END:variables
}
