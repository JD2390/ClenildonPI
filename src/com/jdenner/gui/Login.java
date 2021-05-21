/*
 * Login do sistema sem banco de dados fiquei com preguiça de fazer.
 */
package com.jdenner.gui;

import com.jdenner.gui.tm.UserValidar;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Clenildon
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form longin
     */
    public Login() {
        initComponents();
    }

    /**
     * validação dos botões e campos a ser preenchidos
     * .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btSair = new javax.swing.JButton();
        btEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Sistema de Vendas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/user_accounts_15362 (2).png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, 20, 360, 80);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setText("Usuário:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 110, 70, 20);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setText("Senha:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 170, 50, 20);

        txtuser.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });
        jPanel1.add(txtuser);
        txtuser.setBounds(50, 130, 240, 30);

        txtSenha.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtSenha);
        txtSenha.setBounds(50, 190, 240, 30);

        btSair.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/vcsconflicting_93497.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair);
        btSair.setBounds(50, 250, 100, 40);

        btEntrar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/vcsnormal_93488.png"))); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btEntrar);
        btEntrar.setBounds(180, 250, 110, 41);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(351, 346));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        UserValidar msvalidar = new UserValidar();
        if (!msvalidar.validarUsuario(txtuser.getText(), 
                new String(txtSenha.getPassword()))){
            JOptionPane.showMessageDialog(this, "O Nome de Usuário ou Senha está Incorreta");
            txtuser.setText("");
            txtSenha.setText("");
            txtuser.requestFocusInWindow();
            return;
        }else{
            JOptionPane.showMessageDialog(this, "Bem Vindo ao Sistema de Vendas da Jthep");
        }
        Menu mmenu = new Menu();
        this.setVisible(false);
        mmenu.setVisible(true);
        
    }//GEN-LAST:event_btEntrarActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            UserValidar msvalidar = new UserValidar();
        if (!msvalidar.validarUsuario(txtuser.getText(), 
                new String(txtSenha.getPassword()))){
            JOptionPane.showMessageDialog(this, "O Nome de Usuário ou Senha está Incorreta");
            txtuser.setText("");
            txtSenha.setText("");
            txtuser.requestFocusInWindow();
            return;
        }else{
            JOptionPane.showMessageDialog(this, "Bem Vindo ao Sistema de Vendas da Jthep");
        }
       
        Menu mmenu = new Menu();
        this.setVisible(false);
        mmenu.setVisible(true);
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            UserValidar msvalidar = new UserValidar();
        if (!msvalidar.validarUsuario(txtuser.getText(), 
                new String(txtSenha.getPassword()))){
            JOptionPane.showMessageDialog(this, "O Nome de Usuário ou Senha está Incorreta");
            txtuser.setText("");
            txtSenha.setText("");
            txtuser.requestFocusInWindow();
            return;
        }else{
            JOptionPane.showMessageDialog(this, "Bem Vindo ao Sistema de Vendas da Jthep");
        }
       
        Menu mmenu = new Menu();
        this.setVisible(false);
        mmenu.setVisible(true);
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
