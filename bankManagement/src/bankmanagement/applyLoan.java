/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankmanagement;

import java.awt.Color;
import java.awt.Image;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Janeesha
 */
public class applyLoan extends javax.swing.JFrame {

    /**
     * Creates new form applyLoan
     */
    int loanType, age, duration, accNumber;
    String typeOfLoan, date;
    Connection conn;
    InputStream image;
    double salary, loan, interest, totalLoan, totalLoan1, balance;

    public applyLoan() {
    }

    public applyLoan(int accNumber) {
        this.accNumber = accNumber;
        initComponents();
        conn = dbConfig.getConnection();
        startChecker3();
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        jLabel13.setEnabled(false);
        jLabel13.setVisible(false);
        jTextField1.setBackground(new Color(0, 0, 0, 1));
        jTextField2.setBackground(new Color(0, 0, 0, 1));
        jTextField3.setBackground(new Color(0, 0, 0, 1));
        jTextField4.setBackground(new Color(0, 0, 0, 1));
        jTextField5.setBackground(new Color(0, 0, 0, 1));
        jTextField6.setBackground(new Color(0, 0, 0, 1));
        jTextField7.setBackground(new Color(0, 0, 0, 1));
        jTextField8.setBackground(new Color(0, 0, 0, 1));
        jTextField9.setBackground(new Color(0, 0, 0, 1));
        jTextField10.setBackground(new Color(0, 0, 0, 1));
        jTextField11.setBackground(new Color(0, 0, 0, 1));
        jComboBox1.setBackground(new Color(0, 0, 0, 1));
        jButton1.setBackground(new Color(0, 0, 0, 0));
        startChecker1();
        startChecker2();
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
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system images/can't apply loan.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(360, 90, 850, 580);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(null);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(820, 350, 40, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(null);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(680, 350, 40, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setBorder(null);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(540, 350, 80, 30);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(960, 350, 80, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system images/success-apply loan.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(350, 80, 869, 593);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 290, 30);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 150, 300, 30);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(7, 206, 300, 30);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(7, 310, 300, 30);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(7, 360, 300, 30);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(7, 410, 300, 30);

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(7, 460, 300, 30);

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1060, 0, 70, 50);

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1160, 0, 70, 50);

        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(612, 593, 340, 40);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(98, 9, 17));
        jTextField1.setBorder(null);
        jTextField1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(525, 311, 210, 25);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(98, 9, 17));
        jTextField2.setBorder(null);
        jTextField2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(978, 306, 210, 25);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(98, 9, 17));
        jTextField3.setBorder(null);
        jTextField3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(525, 361, 210, 25);

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(98, 9, 17));
        jTextField4.setBorder(null);
        jTextField4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(1021, 356, 130, 25);

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(98, 9, 17));
        jTextField5.setBorder(null);
        jTextField5.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(1020, 406, 130, 25);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(98, 9, 17));
        jTextField6.setBorder(null);
        jTextField6.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(978, 456, 210, 25);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(98, 9, 17));
        jTextField7.setBorder(null);
        jTextField7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(978, 504, 210, 25);

        jRadioButton1.setBackground(new java.awt.Color(227, 242, 254));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setText("Personal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(440, 450, 110, 29);

        jRadioButton2.setBackground(new java.awt.Color(227, 242, 254));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setText("Home");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(560, 450, 110, 29);

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 640, 300, 30);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(714, 93, 150, 180);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Year", "2 Year", "3 Year", "4 Year", "5 Year" }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(523, 504, 210, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system images/apply bank loan.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1250, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
            loanType = 0;
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        adminLogin log = new adminLogin();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        homePage log = new homePage();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        account log = new account(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        deposit log = new deposit(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        transaction log = new transaction(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        withdraw log = new withdraw(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        billPay log = new billPay(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        payLoan log = new payLoan(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
            loanType = 1;
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        accStatement log = new accStatement(accNumber);
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        duration = (jComboBox1.getSelectedIndex() + 1);

        interest = getInterest();
        // Check weather customer is eligible for loan or not,by considering(age,annual salary,loan ammount )
        if (validSalary() && validLoan()) {
            DecimalFormat df = new DecimalFormat("0.00");
            totalLoan1 = loan + (loan * interest) / 100.0;
            totalLoan = Double.parseDouble(df.format(totalLoan1));

            if (18 <= age && age <= 60) {
                if (salary >= 600000.00) {
                    if (loan >= 50000.00 && loan <= 10000000.00) {
                        insertDatabase1();
                    } else {
                        JOptionPane.showMessageDialog(null, "You're not elligible for a loan \nLoans are available from Rs 200,000/= to Rs 10,000,000/= ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You're not elligible for a loan \nYour annual salary should up to Rs.600,000/= .", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "You're not elligible for a loan \nYour age should between 18 to 60 years,when applying for a loan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void startChecker1() {
        if (loanType == 0) {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            typeOfLoan = "personal";
        } else {
            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            typeOfLoan = "home";
        }
    }

    private void startChecker2() {
        jTextField2.setText(Integer.toString(accNumber));

        try {
            PreparedStatement pa;
            ResultSet rs;

            String query = "SELECT * FROM `customerlogin` WHERE `accountNumber` = ?";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            rs = pa.executeQuery();

            if (rs.next()) {
                jTextField1.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField6.setText(rs.getString(9));
                jTextField7.setText(rs.getString(11));

                age = Integer.parseInt(rs.getString(3));

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
        } catch (SQLException ex) {
            Logger.getLogger(applyLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validSalary() {
        if (jTextField4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Annual Salary", "Error", 2);
            return false;
        } else if (!jTextField4.getText().matches("^\\d+\\.\\d+")) {
            JOptionPane.showMessageDialog(null, "Please Ennter a Valid Salary in Double!!!", "Error", 2);
            jTextField4.setText("");
            return false;
        } else {
            salary = Double.parseDouble(jTextField4.getText());
            return true;
        }
    }

    private boolean validLoan() {
        if (jTextField5.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Loan Amount", "Error", 2);
            return false;
        } else if (!jTextField5.getText().matches("^\\d+\\.\\d+")) {
            JOptionPane.showMessageDialog(null, "Please Ennter a Valid Amount in Double!!!", "Error", 2);
            jTextField5.setText("");
            return false;
        } else {
            loan = Double.parseDouble(jTextField5.getText());
            return true;
        }
    }

    private void insertDatabase1() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        date = dtf.format(now);
        
        try {
            PreparedStatement pa;

            String query = "INSERT INTO `loanAcceptors` (`accountNumber` ,`age` ,`salary` ,`loanType` ,`loan` ,`interestRate` ,`duration` ,`totalLoan` ,`date` ) VALUES (?,?,?,?,?,?,?,?,?)";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            pa.setInt(2, age);
            pa.setDouble(3, salary);
            pa.setInt(4, loanType);
            pa.setDouble(5, loan);
            pa.setDouble(6, interest);
            pa.setInt(7, duration);
            pa.setDouble(8, totalLoan);
            pa.setString(9, date);
            if (pa.executeUpdate() != 0) {
                insertDatabase2();
            } else {
                JOptionPane.showMessageDialog(null, "Details aren't successfully inserted", "failed", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(applyLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void insertDatabase2() {
        getBalance();
        try {
            PreparedStatement paa;

            String query = "INSERT INTO `accstatement` (`accountNumber` ,`description` ,`referenceNumber` ,`debit` ,`credit` ,`balance` ,`date`) VALUES (?,?,?,?,?,?,?)";
            paa = conn.prepareStatement(query);
            paa.setInt(1, accNumber);
            paa.setString(2, "Obtain Loan");
            paa.setInt(3, 0);
            paa.setDouble(4, loan);
            paa.setDouble(5, 0.0);
            paa.setDouble(6, balance + loan);
            paa.setString(7, date);

            if (paa.executeUpdate() != 0) {
                jLabel13.setEnabled(true);
                jLabel13.setVisible(true);
                jTextField8.setText(Double.toString(totalLoan));
                jTextField9.setText(Double.toString(interest));
                jTextField10.setText(Integer.toString(duration));
                jTextField11.setText(Double.toString(loan));
            } else {
                JOptionPane.showMessageDialog(null, "Details aren't successfully inserted", "failed", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(applyLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getInterest() {
        if (loanType == 0) {
            try {
                PreparedStatement pa;
                ResultSet rs;

                String query = "SELECT * FROM `personalloanir` WHERE `duration` = ?";
                pa = conn.prepareStatement(query);
                pa.setInt(1, duration);
                rs = pa.executeQuery();

                if (rs.next()) {
                    interest = Double.parseDouble(rs.getString(3));
                    return interest;
                }
            } catch (SQLException ex) {
                Logger.getLogger(applyLoan.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (loanType == 1) {
            try {
                PreparedStatement pa;
                ResultSet rs;

                String query = "SELECT * FROM `homeloanir` WHERE `duration` = ?";
                pa = conn.prepareStatement(query);
                pa.setInt(1, duration);
                rs = pa.executeQuery();

                if (rs.next()) {
                    interest = Double.parseDouble(rs.getString(3));
                    return interest;
                }
            } catch (SQLException ex) {
                Logger.getLogger(applyLoan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public void startChecker3() {
        try {
            PreparedStatement pa;
            ResultSet rs;
            
            String query = "SELECT * FROM `loanAcceptors` WHERE `accountNumber` = ?";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            rs = pa.executeQuery();
            if (rs.next()) {
                jLabel14.setEnabled(true);
                jLabel14.setVisible(true);
            } else {
                jLabel14.setEnabled(false);
                jLabel14.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(applyLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getBalance() {
        calculateBalance c = new calculateBalance(accNumber);
        balance = c.getLastBalance();
    }
    
    /*
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
            java.util.logging.Logger.getLogger(applyLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applyLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applyLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applyLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applyLoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
