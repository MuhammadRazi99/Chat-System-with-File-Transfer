/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.project;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class ChatRoom extends javax.swing.JFrame {

    /**
     * Creates new form ChatRoom
     */
    public ChatRoom() {
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

        side = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        sendIcon = new javax.swing.JLabel();
        TextMessage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        SendFile = new javax.swing.JButton();
        BackTextLabel = new javax.swing.JLabel();
        BackIconLabel = new javax.swing.JLabel();
        ClientName = new javax.swing.JLabel();
        newRoom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHAT ROOM");
        setMinimumSize(new java.awt.Dimension(800, 571));
        setPreferredSize(new java.awt.Dimension(0, 0));

        side.setBackground(new java.awt.Color(200, 63, 38));

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        main.setBackground(new java.awt.Color(238, 132, 91));

        sendIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/send icon 1.png"))); // NOI18N
        sendIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendIconMouseClicked(evt);
            }
        });

        TextMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextMessageKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextMessageKeyTyped(evt);
            }
        });

        textArea.setBackground(new java.awt.Color(200, 63, 38));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        textArea.setForeground(new java.awt.Color(240, 240, 240));
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        SendFile.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        SendFile.setText("FILE");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TextMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(SendFile, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(sendIcon)
                .addGap(25, 25, 25))
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SendFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextMessage))
                .addGap(46, 46, 46))
        );

        BackTextLabel.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        BackTextLabel.setText("BACK");
        BackTextLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackTextLabelMouseClicked(evt);
            }
        });

        BackIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back arrow.png"))); // NOI18N
        BackIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIconLabelMouseClicked(evt);
            }
        });

        ClientName.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        ClientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientName.setName(""); // NOI18N

        newRoom.setBackground(new java.awt.Color(200, 63, 38));
        newRoom.setText("NEW ROOM");
        newRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackIconLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackTextLabel)
                .addGap(189, 189, 189)
                .addComponent(ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newRoom)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newRoom)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BackTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addComponent(ClientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendIconMouseClicked
        // TODO add your handling code here:
        //        new JLabel().setText(TextMessage.getText());
        //        System.out.println(TextMessage.getLocation());
        //        System.out.println(TextMessage.getText());
        //        TextMessage.setText("");
        String s=textArea.getText();
        textArea.setText(s+"You:\n"+TextMessage.getText()+"\n");
        TextMessage.setText("");
        try {
            Client.clientConn(s);
        } catch (IOException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendIconMouseClicked

    private void TextMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMessageKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String s=textArea.getText();
            textArea.setText(s+"You:\n"+TextMessage.getText()+"\n");
            TextMessage.setText("");
        }
    }//GEN-LAST:event_TextMessageKeyPressed

    private void TextMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMessageKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_TextMessageKeyTyped

    private void BackTextLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackTextLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_BackTextLabelMouseClicked

    private void BackIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_BackIconLabelMouseClicked

    private void newRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRoomActionPerformed
        // TODO add your handling code here:
        JLabel j1 = new JLabel("Random");
        j1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        side.add(j1);        
    }//GEN-LAST:event_newRoomActionPerformed

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatRoom().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIconLabel;
    private javax.swing.JLabel BackTextLabel;
    private javax.swing.JLabel ClientName;
    private javax.swing.JButton SendFile;
    private javax.swing.JTextField TextMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main;
    private javax.swing.JButton newRoom;
    private javax.swing.JLabel sendIcon;
    private javax.swing.JPanel side;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
