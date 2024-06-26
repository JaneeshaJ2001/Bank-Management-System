/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankmanagement;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Janeesha
 */
public class adminLogin extends javax.swing.JFrame {

    /**
     * Creates new form adminLogin
     */
    String userName, password;
    Connection conn;

    public adminLogin() {
        initComponents();
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        userNameText.setBackground(new Color(0, 0, 0, 1));
        jPasswordField1.setBackground(new Color(0, 0, 0, 1));
        logginBtn.setBackground(new Color(0, 0, 0, 0));
        eraseBtn.setBackground(new Color(0, 0, 0, 0));
        eyeBtn.setBackground(new Color(0, 0, 0, 0));
        conn = dbConfig.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();
        customerIcon = new javax.swing.JLabel();
        eraseBtn = new javax.swing.JButton();
        eyeBtn = new javax.swing.JButton();
        logginBtn = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        userNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1250, 700, 0, 0);

        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });
        getContentPane().add(homeIcon);
        homeIcon.setBounds(1170, 0, 70, 50);

        adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminIconMouseClicked(evt);
            }
        });
        getContentPane().add(adminIcon);
        adminIcon.setBounds(1070, 0, 70, 50);

        customerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerIconMouseClicked(evt);
            }
        });
        getContentPane().add(customerIcon);
        customerIcon.setBounds(940, 0, 100, 50);

        eraseBtn.setBorder(null);
        eraseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eraseBtn);
        eraseBtn.setBounds(760, 500, 50, 30);

        eyeBtn.setBorder(null);
        eyeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eyeBtn);
        eyeBtn.setBounds(750, 450, 40, 30);

        logginBtn.setBorder(null);
        logginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logginBtn);
        logginBtn.setBounds(470, 570, 310, 50);

        jPasswordField1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        jPasswordField1.setMargin(new java.awt.Insets(20, 20, 20, 20));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(530, 450, 200, 30);

        userNameText.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        userNameText.setForeground(new java.awt.Color(255, 255, 255));
        userNameText.setBorder(null);
        userNameText.setMargin(new java.awt.Insets(10, 10, 10, 10));
        getContentPane().add(userNameText);
        userNameText.setBounds(530, 330, 260, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system images/admin login.png"))); // NOI18N
        jLabel1.setText("hjkllldfgh");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eraseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseBtnActionPerformed
        // TODO add your handling code here:
        userNameText.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_eraseBtnActionPerformed

    private void customerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerIconMouseClicked
        // TODO add your handling code here:
        customerLogin log = new customerLogin();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_customerIconMouseClicked

    private void adminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminIconMouseClicked
        // TODO add your handling code here:
        adminLogin log = new adminLogin();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_adminIconMouseClicked

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        // TODO add your handling code here:
        homePage log = new homePage();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_homeIconMouseClicked

    private void eyeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyeBtnActionPerformed
        // TODO add your handling code here:
        jPasswordField1.setEchoChar((char) 0);
    }//GEN-LAST:event_eyeBtnActionPerformed

    private boolean checkValidity() {
        userName = this.userNameText.getText();
        password = String.valueOf(this.jPasswordField1.getPassword());

        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Username", "Error", 2);
            return false;
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Ennter Your Password", "Error", 2);
            return false;
        } else {
            return true;
        }
    }

    private void logginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logginBtnActionPerformed
        // TODO add your handling code here
        if (checkValidity()) {
            userName = this.userNameText.getText();
            password = String.valueOf(this.jPasswordField1.getPassword());

            try {
                PreparedStatement pa;
                ResultSet rs;

                String query = "SELECT * FROM `adminlogin` WHERE `username` LIKE ? AND `password` LIKE ?";
                pa = conn.prepareStatement(query);
                pa.setString(1, userName);
                pa.setString(2, password);
                rs = pa.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Admin loggin successfull");

                    adminDashboard log = new adminDashboard();
                    log.setVisible(true);
                    log.pack();
                    log.setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Loggin failed !!!\nPlease try again ", "loggin failed", 2);
                    userNameText.setText("");
                    jPasswordField1.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(adminLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_logginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel customerIcon;
    private javax.swing.JButton eraseBtn;
    private javax.swing.JButton eyeBtn;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton logginBtn;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
