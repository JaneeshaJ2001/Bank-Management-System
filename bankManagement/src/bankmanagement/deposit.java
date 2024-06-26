/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankmanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Janeesha
 */
public class deposit extends javax.swing.JFrame {

    /**
     * Creates new form deposit
     */
    String date;
    Connection conn;
    int accNumber, count1, count2, count3, count4, count5, count6, count7, count8, tcount1, tcount2, tcount3, tcount4, tcount5, tcount6, tcount7, tcount8, total;
    double balance;

    public deposit() {
    }

    public deposit(int accNumber) {
        initComponents();
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        jTextField1.setBackground(new Color(0, 0, 0, 1));
        jTextField2.setBackground(new Color(0, 0, 0, 1));
        jTextField3.setBackground(new Color(0, 0, 0, 1));
        jTextField4.setBackground(new Color(0, 0, 0, 1));
        jTextField13.setBackground(new Color(0, 0, 0, 1));
        jTextField14.setBackground(new Color(0, 0, 0, 1));
        jTextField15.setBackground(new Color(0, 0, 0, 1));
        jTextField16.setBackground(new Color(0, 0, 0, 1));
        jTextField17.setBackground(new Color(0, 0, 0, 1));
        jTextField18.setBackground(new Color(0, 0, 0, 1));
        jTextField19.setBackground(new Color(0, 0, 0, 1));
        jTextField20.setBackground(new Color(0, 0, 0, 1));
        jTextField21.setBackground(new Color(0, 0, 0, 1));
        jButton1.setBackground(new Color(0, 0, 0, 0));
        jButton2.setBackground(new Color(0, 0, 0, 0));
        conn = dbConfig.getConnection();
        this.accNumber = accNumber;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

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
        jLabel4.setBounds(20, 100, 280, 30);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 200, 280, 40);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 260, 280, 30);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 310, 280, 30);

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

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 470, 280, 30);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(144, 144, 144));
        jTextField1.setBorder(null);
        jTextField1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(620, 98, 220, 22);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(144, 144, 144));
        jTextField2.setBorder(null);
        jTextField2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(950, 98, 230, 22);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(144, 144, 144));
        jTextField3.setBorder(null);
        jTextField3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(620, 135, 220, 22);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(890, 180, 170, 40);

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField5MouseReleased(evt);
            }
        });
        jTextField5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField5InputMethodTextChanged(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(840, 300, 63, 22);

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField6.setBorder(null);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(840, 330, 63, 22);

        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField7.setBorder(null);
        jTextField7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(840, 360, 63, 20);

        jTextField8.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField8.setBorder(null);
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(840, 390, 63, 22);

        jTextField9.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField9.setBorder(null);
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(840, 420, 63, 22);

        jTextField10.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField10.setBorder(null);
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(840, 450, 69, 22);

        jTextField11.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField11.setBorder(null);
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(840, 480, 69, 22);

        jTextField12.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField12.setBorder(null);
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField12);
        jTextField12.setBounds(840, 510, 69, 22);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField13.setBorder(null);
        jTextField13.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField13);
        jTextField13.setBounds(1020, 300, 90, 22);

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField14.setBorder(null);
        jTextField14.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField14);
        jTextField14.setBounds(1020, 330, 90, 22);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField15.setBorder(null);
        jTextField15.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField15);
        jTextField15.setBounds(1020, 360, 90, 22);

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField16.setBorder(null);
        jTextField16.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField16);
        jTextField16.setBounds(1020, 390, 90, 22);

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField17.setBorder(null);
        jTextField17.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField17);
        jTextField17.setBounds(1020, 420, 90, 22);

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField18.setBorder(null);
        jTextField18.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField18);
        jTextField18.setBounds(1020, 450, 90, 22);

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField19.setBorder(null);
        jTextField19.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField19);
        jTextField19.setBounds(1020, 480, 90, 22);

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jTextField20.setBorder(null);
        jTextField20.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField20);
        jTextField20.setBounds(1020, 510, 90, 22);

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        jTextField21.setBorder(null);
        jTextField21.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jPanel1.add(jTextField21);
        jTextField21.setBounds(1010, 550, 100, 30);

        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 603, 340, 40);

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 650, 280, 30);

        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1147, 543, 60, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system images/deposit.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1250, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        account log = new account(accNumber);
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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

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

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        date = dtf.format(now);

        try {
            PreparedStatement paa;
            
            String query = "INSERT INTO `accStatement` (`accountNumber` ,`description` ,`referenceNumber` ,`debit` , `credit` , `balance` , `date`) VALUES (?,?,?,?,?,?,?)";
            paa = conn.prepareStatement(query);
            paa.setInt(1, accNumber);
            paa.setString(2, "Deposit");
            paa.setInt(3, 0);
            paa.setDouble(4, total);
            paa.setDouble(5, 0.0);
            paa.setDouble(6, balance+total);
            paa.setString(7, date);
            
            if (paa.executeUpdate() != 0) {
                //TimeUnit.SECONDS.sleep(2);
                JOptionPane.showMessageDialog(null, "Your deposit has been Succfully performed !");
                clearData();
                getBalance();
            } else {
                JOptionPane.showMessageDialog(null, "Details aren't successfully recorded", "failed", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField5InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5InputMethodTextChanged

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseReleased

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        count1 = Integer.parseInt(jTextField5.getText());
        tcount1 = count1 * 5000;
        jTextField13.setText(Integer.toString(tcount1));
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        count2 = Integer.parseInt(jTextField6.getText());
        tcount2 = count2 * 2000;
        jTextField14.setText(Integer.toString(tcount2));

    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
        count3 = Integer.parseInt(jTextField7.getText());
        tcount3 = count3 * 1000;
        jTextField15.setText(Integer.toString(tcount3));
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
        count4 = Integer.parseInt(jTextField8.getText());
        tcount4 = count4 * 500;
        jTextField16.setText(Integer.toString(tcount4));
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
        count5 = Integer.parseInt(jTextField9.getText());
        tcount5 = count5 * 100;
        jTextField17.setText(Integer.toString(tcount5));
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
        count6 = Integer.parseInt(jTextField10.getText());
        tcount6 = count6 * 50;
        jTextField18.setText(Integer.toString(tcount6));
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        // TODO add your handling code here:
        count7 = Integer.parseInt(jTextField11.getText());
        tcount7 = count7 * 20;
        jTextField19.setText(Integer.toString(tcount7));
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        // TODO add your handling code here:
        count8 = Integer.parseInt(jTextField12.getText());
        tcount8 = count8 * 10;
        jTextField20.setText(Integer.toString(tcount8));
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jTextField5.getText().isEmpty()) {
            jTextField5.setText("0");
            jTextField13.setText("0");
        }
        if (jTextField6.getText().isEmpty()) {
            jTextField6.setText("0");
            jTextField14.setText("0");
        }
        if (jTextField7.getText().isEmpty()) {
            jTextField7.setText("0");
            jTextField15.setText("0");
        }
        if (jTextField8.getText().isEmpty()) {
            jTextField8.setText("0");
            jTextField16.setText("0");
        }
        if (jTextField9.getText().isEmpty()) {
            jTextField9.setText("0");
            jTextField17.setText("0");
        }
        if (jTextField10.getText().isEmpty()) {
            jTextField10.setText("0");
            jTextField18.setText("0");
        }
        if (jTextField11.getText().isEmpty()) {
            jTextField11.setText("0");
            jTextField19.setText("0");
        }
        if (jTextField12.getText().isEmpty()) {
            jTextField12.setText("0");
            jTextField20.setText("0");
        }
        total = tcount1 + tcount2 + tcount3 + tcount4 + tcount5 + tcount6 + tcount7 + tcount8;
        jTextField21.setText(Integer.toString(total));
    }//GEN-LAST:event_jButton2ActionPerformed

    public void startChecker() {
        LocalDate Date = java.time.LocalDate.now();

        jTextField1.setText(Integer.toString(accNumber));
        jTextField2.setText(Date.toString());
        getBalance();
        
        try {
            PreparedStatement pa;
            ResultSet rs;

            String query = "SELECT * FROM `customerlogin` WHERE `accountNumber` = ?";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            rs = pa.executeQuery();

            if (rs.next()) {
                jTextField3.setText(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getBalance() {
        calculateBalance c = new calculateBalance(accNumber);
        balance = c.getLastBalance();
        jTextField4.setText(Double.toString(balance));
    }

    public void clearData() {
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
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
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
