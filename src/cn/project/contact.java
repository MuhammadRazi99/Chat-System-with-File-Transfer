/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.project;

/**
 *
 * @author DELL
 */
public class contact extends javax.swing.JFrame {

    /**
     * Creates new form contact
     */
    public contact() {
        initComponents();
    }
    public String hostname="";
    public String IP="";

    
    public boolean checkIPAddress(String IP){
        String [] IPString=IP.split("\\.");
        if(IPString.length != 4)
            {return false;}
        int i=0;
        while(i<=3){
            try{
                int IPv4=Integer.parseInt(IPString[i]);
                if((IPv4<0) || (IPv4>255))
                    {return false;}
            }
            catch(Exception e)
            {e.printStackTrace();}
            i++;    
            }        
        return true;    
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
        plusLabelText2 = new javax.swing.JLabel();
        plusLabelIcon = new javax.swing.JLabel();
        plusLabelText = new javax.swing.JLabel();
        Jlabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hostnametext = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        IPtext = new javax.swing.JTextPane();
        main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side.setBackground(new java.awt.Color(200, 63, 38));

        backLabelIcon.setIcon(new javax.swing.ImageIcon("D:\\Razi\\Java\\Chat-System-with-File-Transfer\\src\\Images\\back arrow.png")); // NOI18N
        backLabelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelIconMouseClicked(evt);
            }
        });

        Jlabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Jlabel1.setText("ADD NEW CONTACTS");
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

        plusLabelText2.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        plusLabelText2.setText("Contacts");
        plusLabelText2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusLabelText2MouseClicked(evt);
            }
        });

        plusLabelIcon.setIcon(new javax.swing.ImageIcon("D:\\Razi\\Java\\Chat-System-with-File-Transfer\\src\\Images\\plus.png")); // NOI18N
        plusLabelIcon.setText("jLabel2");
        plusLabelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusLabelIconMouseClicked(evt);
            }
        });

        plusLabelText.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        plusLabelText.setText("Add New");
        plusLabelText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusLabelTextMouseClicked(evt);
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

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabelIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlabel1)
                            .addComponent(BackTextLabel)
                            .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sideLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2))
                                .addGroup(sideLayout.createSequentialGroup()
                                    .addComponent(Jlabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(sideLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(plusLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plusLabelText2)
                            .addComponent(plusLabelText))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideLayout.createSequentialGroup()
                                .addComponent(plusLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(plusLabelText2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(plusLabelIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130))
                    .addGroup(sideLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        main.setBackground(new java.awt.Color(238, 132, 91));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_Jlabel1MouseClicked

    private void BackTextLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackTextLabelMouseClicked
        // TODO add your handling code here:
                this.setVisible(false);
                new Home().setVisible(true);
    }//GEN-LAST:event_BackTextLabelMouseClicked

    private void plusLabelText2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusLabelText2MouseClicked
        // TODO add your handling code here:
        IP=IPtext.getText();
        IPtext.setText("");
        hostname=hostnametext.getText();
        hostnametext.setText("");
        if(!checkIPAddress(IP)){
            IPtext.setText("Invalid IP Address");
        }
        System.out.println("IP="+IP);
        System.out.println("Hostname="+hostname);
    }//GEN-LAST:event_plusLabelText2MouseClicked

    private void plusLabelTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusLabelTextMouseClicked
        // TODO add your handling code here:
        IP=IPtext.getText();
        IPtext.setText("");
        hostname=hostnametext.getText();
        hostnametext.setText("");
        if(!checkIPAddress(IP)){
            IPtext.setText("Invalid IP Address");
        }
        System.out.println("IP="+IP);
        System.out.println("Hostname="+hostname);
    }//GEN-LAST:event_plusLabelTextMouseClicked

    private void Jlabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jlabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void backLabelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelIconMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backLabelIconMouseClicked

    private void plusLabelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusLabelIconMouseClicked
        // TODO add your handling code here:
        IP=IPtext.getText();
        IPtext.setText("");
        hostname=hostnametext.getText();
        hostnametext.setText("");
        if(!checkIPAddress(IP)){
            IPtext.setText("Invalid IP Address");
        }
        System.out.println("IP="+IP);
        System.out.println("Hostname="+hostname);
    }//GEN-LAST:event_plusLabelIconMouseClicked

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
    private javax.swing.JLabel BackTextLabel;
    private javax.swing.JTextPane IPtext;
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JLabel backLabelIcon;
    private javax.swing.JTextPane hostnametext;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel main;
    private javax.swing.JLabel plusLabelIcon;
    private javax.swing.JLabel plusLabelText;
    private javax.swing.JLabel plusLabelText2;
    private javax.swing.JPanel side;
    // End of variables declaration//GEN-END:variables
}