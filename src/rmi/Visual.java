package rmi;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Visual extends javax.swing.JFrame {
    Server chatServer;
    Client chatClient;
    String username;
    int idClient=0;
    
    public Visual() throws RemoteException {
        this.chatServer = new Server();
        this.chatClient = new Client();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        whoIs = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlActServer = new javax.swing.JPanel();
        lblActServer = new javax.swing.JLabel();
        pnlActClient = new javax.swing.JPanel();
        lblActCient = new javax.swing.JLabel();
        pnlSendMsg = new javax.swing.JPanel();
        lblEnviarMsj = new javax.swing.JLabel();
        pnlSendPrivMsg = new javax.swing.JPanel();
        lblEnviarMsjPriv = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 234, 241));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        whoIs.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        whoIs.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(whoIs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 153, 65));
        whoIs.getAccessibleContext().setAccessibleName("name");

        txtMensaje.setBackground(new java.awt.Color(255, 255, 255));
        txtMensaje.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(0, 0, 0));
        txtMensaje.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMensaje.setBorder(null);
        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });
        jPanel1.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 710, 120));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CHAT RMI:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 65));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 953, 200));

        pnlActServer.setBackground(new java.awt.Color(0, 0, 0));

        lblActServer.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblActServer.setForeground(new java.awt.Color(255, 255, 255));
        lblActServer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActServer.setText("Server");
        lblActServer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActServerMouseClicked(evt);
            }
        });
        lblActServer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblActServerKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlActServerLayout = new javax.swing.GroupLayout(pnlActServer);
        pnlActServer.setLayout(pnlActServerLayout);
        pnlActServerLayout.setHorizontalGroup(
            pnlActServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActServer, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        pnlActServerLayout.setVerticalGroup(
            pnlActServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActServerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblActServer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlActServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 140, 30));

        pnlActClient.setBackground(new java.awt.Color(0, 0, 0));

        lblActCient.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblActCient.setForeground(new java.awt.Color(255, 255, 255));
        lblActCient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActCient.setText("Client");
        lblActCient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActCient.setFocusable(false);
        lblActCient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblActCient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActCientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlActClientLayout = new javax.swing.GroupLayout(pnlActClient);
        pnlActClient.setLayout(pnlActClientLayout);
        pnlActClientLayout.setHorizontalGroup(
            pnlActClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActCient, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        pnlActClientLayout.setVerticalGroup(
            pnlActClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActClientLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblActCient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlActClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 140, 30));

        pnlSendMsg.setBackground(new java.awt.Color(0, 0, 0));

        lblEnviarMsj.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblEnviarMsj.setForeground(new java.awt.Color(255, 255, 255));
        lblEnviarMsj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnviarMsj.setText("Send message");
        lblEnviarMsj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnviarMsj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnviarMsjMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSendMsgLayout = new javax.swing.GroupLayout(pnlSendMsg);
        pnlSendMsg.setLayout(pnlSendMsgLayout);
        pnlSendMsgLayout.setHorizontalGroup(
            pnlSendMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEnviarMsj, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        pnlSendMsgLayout.setVerticalGroup(
            pnlSendMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSendMsgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEnviarMsj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlSendMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 170, 30));

        pnlSendPrivMsg.setBackground(new java.awt.Color(0, 0, 0));

        lblEnviarMsjPriv.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblEnviarMsjPriv.setForeground(new java.awt.Color(255, 255, 255));
        lblEnviarMsjPriv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnviarMsjPriv.setText("Send private message");
        lblEnviarMsjPriv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnviarMsjPriv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnviarMsjPrivMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSendPrivMsgLayout = new javax.swing.GroupLayout(pnlSendPrivMsg);
        pnlSendPrivMsg.setLayout(pnlSendPrivMsgLayout);
        pnlSendPrivMsgLayout.setHorizontalGroup(
            pnlSendPrivMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSendPrivMsgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEnviarMsjPriv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSendPrivMsgLayout.setVerticalGroup(
            pnlSendPrivMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSendPrivMsgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEnviarMsjPriv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlSendPrivMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 170, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Write a message:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed
        
    }//GEN-LAST:event_txtMensajeActionPerformed

    private void lblActServerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblActServerKeyPressed

    }//GEN-LAST:event_lblActServerKeyPressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void lblActServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActServerMouseClicked
        String Ip=JOptionPane.showInputDialog(null, "Your IP", "Server", JOptionPane.PLAIN_MESSAGE);
        chatServer.connection(Ip);
        
        jTextArea1.append("Server connected.");
        
        txtMensaje.setVisible(false);
        
        lblEnviarMsj.setVisible(false);
        lblEnviarMsjPriv.setVisible(false);
        lblActCient.setVisible(false);
        lblActServer.setVisible(false);
        
        pnlActClient.setVisible(false);
        pnlActServer.setVisible(false);
        pnlSendMsg.setVisible(false);
        pnlSendPrivMsg.setVisible(false);
        jLabel1.setVisible(false);
        
        whoIs.setText("Server");
    }//GEN-LAST:event_lblActServerMouseClicked

    private void lblActCientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActCientMouseClicked
        if(idClient<5){
            String Ip=JOptionPane.showInputDialog(null, "Server IP", "Client", JOptionPane.PLAIN_MESSAGE);
            username=JOptionPane.showInputDialog(null, "Username", "Client", JOptionPane.PLAIN_MESSAGE);
            
            chatClient=new Client();
            chatClient.startClient(username, jTextArea1,Ip);
            
            idClient++;
            jTextArea1.append("Connected to server. ");
            whoIs.setText(username);
        }
        
        lblActServer.setVisible(false);
        pnlActServer.setVisible(false);
    }//GEN-LAST:event_lblActCientMouseClicked

    private void lblEnviarMsjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnviarMsjMouseClicked
        if(!txtMensaje.getText().isEmpty()){
            String message=txtMensaje.getText();

            try {
                chatClient.sendMessage(message,username);
                System.out.println(idClient-1);
                cleanTxt();
            } catch (RemoteException ex) {
                Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_lblEnviarMsjMouseClicked

    private void lblEnviarMsjPrivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnviarMsjPrivMouseClicked
        if(!txtMensaje.getText().isEmpty()){

            String privateUser=JOptionPane.showInputDialog(rootPane, "Write username to send a private message", "Client", JOptionPane.PLAIN_MESSAGE);
            try {
                chatClient.sendPrivate(username, privateUser, txtMensaje.getText());
                cleanTxt();
            } catch (RemoteException ex) {
                Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblEnviarMsjPrivMouseClicked

    private void cleanTxt(){
        txtMensaje.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Visual().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblActCient;
    private javax.swing.JLabel lblActServer;
    private javax.swing.JLabel lblEnviarMsj;
    private javax.swing.JLabel lblEnviarMsjPriv;
    private javax.swing.JPanel pnlActClient;
    private javax.swing.JPanel pnlActServer;
    private javax.swing.JPanel pnlSendMsg;
    private javax.swing.JPanel pnlSendPrivMsg;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JLabel whoIs;
    // End of variables declaration//GEN-END:variables
}
