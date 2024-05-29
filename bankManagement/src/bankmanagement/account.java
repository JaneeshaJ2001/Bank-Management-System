/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankmanagement;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.util.logging.*;
import javax.swing.ImageIcon;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Janeesha
 */
public class account extends javax.swing.JFrame {

    /**
     * Creates new form account
     */
    byte[] userImage = null;
    String name, nic, birthDate, email, contactNumber, path;
    int accNumber, sex, age;
    Connection conn;
    InputStream img, image;
    double balance;

    public account() {
    }

    public account(int accNumber) {
        this.accNumber = accNumber;
        initComponents();
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        conn = dbConfig.getConnection();
        checkFixedAcc();
        jTextField1.setBackground(new Color(0, 0, 0, 1));
        jTextField2.setBackground(new Color(0, 0, 0, 1));
        jTextField3.setBackground(new Color(0, 0, 0, 1));
        jTextField4.setBackground(new Color(0, 0, 0, 1));
        jTextField5.setBackground(new Color(0, 0, 0, 1));
        jTextField6.setBackground(new Color(0, 0, 0, 1));
        jTextField7.setBackground(new Color(0, 0, 0, 1));
        jTextField9.setBackground(new Color(0, 0, 0, 1));
        jTextField10.setBackground(new Color(0, 0, 0, 1));
        jTextField11.setBackground(new Color(0, 0, 0, 1));
        jButton1.setBackground(new Color(0, 0, 0, 0));
        jButton2.setBackground(new Color(0, 0, 0, 0));
        jButton3.setBackground(new Color(0, 0, 0, 0));
        jButton4.setBackground(new Color(0, 0, 0, 0));
        startChecker();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system images/Rectangle 1_1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 150, 320, 480);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 260, 280, 30);

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 470, 270, 30);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1060, 0, 80, 50);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1160, 0, 80, 50);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 290, 30);

        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 200, 280, 30);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 310, 270, 30);

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 360, 280, 30);

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 410, 280, 30);

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(98, 9, 17));
        jTextField1.setBorder(null);
        jTextField1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(530, 313, 210, 22);

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(98, 9, 17));
        jTextField2.setBorder(null);
        jTextField2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(530, 358, 210, 22);

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(98, 9, 17));
        jTextField3.setBorder(null);
        jTextField3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(530, 408, 160, 22);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(144, 144, 144));
        jTextField4.setBorder(null);
        jTextField4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(530, 458, 210, 22);

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(98, 9, 17));
        jTextField5.setBorder(null);
        jTextField5.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(530, 508, 210, 22);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(144, 144, 144));
        jTextField6.setBorder(null);
        jTextField6.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(980, 308, 210, 22);

        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(98, 9, 17));
        jTextField7.setBorder(null);
        jTextField7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(980, 408, 210, 22);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(144, 144, 144));
        jTextField9.setBorder(null);
        jTextField9.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(980, 508, 210, 22);

        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 600, 290, 40);

        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(850, 600, 290, 40);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField10.setBorder(null);
        jTextField10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField10);
        jTextField10.setBounds(920, 180, 170, 40);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(467, 90, 140, 180);

        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(98, 9, 17));
        jTextField11.setBorder(null);
        jTextField11.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField11);
        jTextField11.setBounds(980, 458, 210, 22);

        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(610, 233, 40, 40);

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 640, 280, 40);

        jButton4.setBorder(null);
        jPanel1.add(jButton4);
        jButton4.setBounds(700, 405, 40, 30);

        jRadioButton1.setBackground(new java.awt.Color(227, 242, 254));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jRadioButton1.setText(" Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(970, 355, 80, 29);

        jRadioButton2.setBackground(new java.awt.Color(227, 242, 254));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jRadioButton2.setText(" Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(1067, 355, 110, 29);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system images/account.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 1250, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1250, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        deposit log = new deposit(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        transaction log = new transaction(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        applyLoan log = new applyLoan(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        accStatement log = new accStatement(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        withdraw log = new withdraw(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        billPay log = new billPay(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        payLoan log = new payLoan(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        adminLogin log = new adminLogin();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        homePage log = new homePage();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    public void startChecker() {
        jTextField6.setText(Integer.toString(accNumber));
        getBalance();

        try {
            PreparedStatement pa;
            ResultSet rs;

            String query = "SELECT * FROM `customerlogin` WHERE `accountNumber` = ?";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            rs = pa.executeQuery();

            if (rs.next()) {
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(5));
                jTextField5.setText(rs.getString(4));
                jTextField7.setText(rs.getString(11));
                jTextField11.setText(rs.getString(9));
                jTextField9.setText(rs.getString(13));

                if ("0".equals(rs.getString(7))) {
                    jTextField4.setText("Savings Account");
                } else if ("1".equals(rs.getString(7))) {
                    jTextField4.setText("Current Account");
                } else if ("2".equals(rs.getString(7))) {
                    jTextField4.setText("Fixed Deposit");
                }

                if ("0".equals(rs.getString(6))) {
                    jRadioButton1.setSelected(true);
                    jRadioButton2.setSelected(false);
                } else if ("1".equals(rs.getString(6))) {
                    jRadioButton2.setSelected(true);
                    jRadioButton1.setSelected(false);
                }

                Blob blob = rs.getBlob(12);
                if (blob == null) {
                    jLabel12.setIcon(null);
                    image = null;
                } else {
                    byte[] imagebyte = blob.getBytes(1, (int) blob.length());
                    ImageIcon image = new ImageIcon(imagebyte);
                    Image getImg = image.getImage();
                    Image setImg = getImg.getScaledInstance(140, 180, Image.SCALE_DEFAULT);
                    ImageIcon finalImage = new ImageIcon(setImg);
                    jLabel12.setIcon(finalImage);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetValue() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField11.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jLabel12.setIcon(null);
        image = null;
    }
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Do You Want To Delete Your Account ?", "Delete Account", JOptionPane.YES_NO_OPTION);
        if (YesOrNo == 0) {

            try {
                PreparedStatement pa;
                String query = "DELETE FROM 'customerlogin' WHERE `accountNumber`=?";
                pa = conn.prepareStatement(query);
                pa.setInt(1, accNumber);

                if (pa.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Deleted successfully !");
                    resetValue();

                    manPage log = new manPage();
                    log.setVisible(true);
                    log.pack();
                    log.setLocationRelativeTo(null);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Delete Unsuccessful ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        name = jTextField1.getText();
        age = Integer.parseInt(jTextField2.getText());;
        birthDate = jTextField3.getText();
        nic = jTextField5.getText();
        email = jTextField7.getText();
        contactNumber = jTextField11.getText();

        if (validName() && validAge() && validNic() && validBirthDate() && validSex() && validContactNumber()) {
            try {
                PreparedStatement pa;

                if (path == null) {
                    String query = "UPDATE `customerlogin` SET `name`=?,`age`=?,`birthDate`=?,`nic`=?,`sex`=? ,`email`=?,`contactNumber`=? WHERE `accountNumber`=?";
                    pa = conn.prepareStatement(query);
                    pa.setString(1, name);
                    pa.setInt(2, age);
                    pa.setString(3, birthDate);
                    pa.setString(4, nic);
                    pa.setInt(5, sex);
                    pa.setString(6, email);
                    pa.setString(7, contactNumber);
                    pa.setInt(8, accNumber);

                    if (pa.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Updated successfully !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Upadate Unsuccessful ", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    String query = "UPDATE `customerlogin` SET `name`=?,`age`=?,`birthDate`=?,`nic`=? ,`sex`=? ,`email`=?,`contactNumber`=?,`image`=? WHERE `accountNumber`=?";
                    pa = conn.prepareStatement(query);
                    pa.setString(1, name);
                    pa.setInt(2, age);
                    pa.setString(3, birthDate);
                    pa.setString(4, nic);
                    pa.setInt(5, sex);
                    pa.setString(6, email);
                    pa.setString(7, contactNumber);
                    pa.setInt(9, accNumber);

                    try {
                        if (path != null) {
                            image = new FileInputStream(new File(path));
                            pa.setBlob(8, image);
                        } else {
                            pa.setNull(8, java.sql.Types.NULL);
                        }

                        if (pa.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "Updated successfully !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Upadate Unsuccessful ", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String imge = null;
        BufferedImage img;
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new File(System.getProperty("")));

        FileNameExtensionFilter extension = new FileNameExtensionFilter("*.Images", "jpg", "png", "jpeg");
        chooser.addChoosableFileFilter(extension);

        int filestate = chooser.showSaveDialog(null);
        if (filestate == JFileChooser.APPROVE_OPTION) {
            try {
                img = ImageIO.read(chooser.getSelectedFile());
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(140, 180, Image.SCALE_DEFAULT));
                jLabel12.setIcon(imageIcon);
                File selectedImage = chooser.getSelectedFile();
                imge = selectedImage.getAbsolutePath();

                path = imge;

            } catch (IOException ex) {
                Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private boolean validName() {
        name = jTextField1.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Name", "Error", 2);
            return false;
        } else {
            return true;
        }
    }

    private boolean validAge() {
        if (jTextField2.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Age", "Error", 2);
            jTextField2.setText("");
            return false;
        } else if (!jTextField2.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Age ", "Error", 2);
            jTextField2.setText("");
            return false;
        } else {
            age = Integer.parseInt(jTextField2.getText());
            return true;
        }
    }

    private boolean validNic() {
        nic = jTextField5.getText();
        if (nic.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your NIC Number", "Error", 2);
            jTextField5.setText("");
            return false;
        } else {
            return true;
        }
    }

    private boolean validBirthDate() {
        birthDate = jTextField3.getText();
        if (birthDate.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Birth Date in yyyy-mm-dd format", "Error", 2);
            jTextField3.setText("");
            return false;
        } else {
            return true;
        }
    }

    private boolean validSex() {
        if (jRadioButton1.isSelected()) {
            sex = 0;
        } else if (jRadioButton2.isSelected()) {
            sex = 1;
        }
        return true;
    }

    private boolean validContactNumber() {
        if (jTextField11.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Contact Number", "Error", 2);
            jTextField11.setText("");
            return false;
        } else if (!jTextField11.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Please Ennter a Valid Contact Number !!!", "Error", 2);
            jTextField11.setText("");
            return false;
        } else if (jTextField11.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Please Enter a 10 Digit Valid Number !!!", "Error", 2);
            jTextField11.setText("");
            return false;
        } else {
            contactNumber = jTextField11.getText();
            return true;
        }
    }

    public void getBalance() {
        calculateBalance c = new calculateBalance(accNumber);
        balance = c.getLastBalance();
        jTextField10.setText(Double.toString(balance));
    }

    public void checkFixedAcc(){
        calculateBalance c = new calculateBalance(accNumber);
        if (c.checkAccFixed()) {
            jLabel1.setEnabled(true);
            jLabel1.setVisible(true);
        } else {
            jLabel1.setEnabled(false);
            jLabel1.setVisible(false);
        }
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
            java.util.logging.Logger.getLogger(account.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}