/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prundustechnologies.View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prundustechnologies.Controller.AppUserController;
import prundustechnologies.Model.AppUser;

/**
 *
 * @author Nipuni
 */
public class LoginForm extends javax.swing.JFrame {

    public static String USER="";
    /**
     * Creates new form LoginForm
     */
    
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameText1 = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        CancelLoginButton = new javax.swing.JButton();

        usernameText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        usernameText.setToolTipText("Type Your Username Here");
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login To Your Account");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password ");
        jLabel5.setOpaque(true);

        usernameText1.setBackground(new java.awt.Color(102, 102, 102));
        usernameText1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        usernameText1.setForeground(new java.awt.Color(255, 255, 255));
        usernameText1.setToolTipText("Type Your Username Here");
        usernameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameText1ActionPerformed(evt);
            }
        });

        passwordText.setBackground(new java.awt.Color(102, 102, 102));
        passwordText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setToolTipText("Type Your Password Here");

        LoginButton.setBackground(java.awt.Color.white);
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prundustechnologies/Images/login.png"))); // NOI18N
        LoginButton.setBorder(null);
        LoginButton.setBorderPainted(false);
        LoginButton.setContentAreaFilled(false);
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setFocusPainted(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        CancelLoginButton.setBackground(java.awt.Color.white);
        CancelLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prundustechnologies/Images/cancel.png"))); // NOI18N
        CancelLoginButton.setBorder(null);
        CancelLoginButton.setBorderPainted(false);
        CancelLoginButton.setContentAreaFilled(false);
        CancelLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelLoginButton.setFocusPainted(false);
        CancelLoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CancelLoginButton.setIconTextGap(0);
        CancelLoginButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        CancelLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameText1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordText)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void usernameText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameText1ActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String username=usernameText1.getText();

        if(username.equals("")){
            JOptionPane.showMessageDialog(LoginForm.this, "Please Enter Your Password", "Alert", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                AppUser checkuser=AppUserController.confirmLogin(username);

                if(checkuser !=null){
                    String password=String.copyValueOf(passwordText.getPassword());
                    String userPassword=checkuser.getPassword();

                    //System.out.println(userPassword);

                    if(userPassword.equals(password)){
                        String checkuser1=AppUserController.getUserRole(userPassword);
                        USER=checkuser1;
                        //System.out.println(USER);
                    }else{
                        JOptionPane.showMessageDialog(LoginForm.this, "User is not exist in the system for the given password.Please Recheck Your password", "Alert", JOptionPane.ERROR_MESSAGE);

                        if(JOptionPane.OK_OPTION==0){
                            passwordText.setText(null);
                        }
                    }

                }else{
                    JOptionPane.showMessageDialog(LoginForm.this, "User is not exist in the system.Please Recheck Your password And Username", "Alert", JOptionPane.ERROR_MESSAGE);

                    if(JOptionPane.OK_OPTION==0){
                        usernameText1.setText(null);
                        passwordText.setText(null);
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CancelLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelLoginButtonActionPerformed
        usernameText1.setText("");
        passwordText.setText("");
    }//GEN-LAST:event_CancelLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelLoginButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField usernameText;
    private javax.swing.JTextField usernameText1;
    // End of variables declaration//GEN-END:variables
}