/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author Janeesha
 */
public class calculateBalance {

    Connection conn;
    int accNumber, rowCount;
    double currentBalance, debit, credit, paidLoanAmount, totalLoan, loanToPay, balanceArr[], balanceRow, lastBalance;

    public calculateBalance(int accNumber) {
        conn = dbConfig.getConnection();
        this.accNumber = accNumber;
    }

    public double getLastBalance() {
        rowCount = getRowCount();
        if (rowCount > 0) {
            Scanner input = new Scanner(System.in);
            double[] balanceArr = new double[rowCount];

            try {
                PreparedStatement pa;
                ResultSet rs;

                String query = "SELECT * FROM `accStatement` WHERE `accountNumber` = ?";
                pa = conn.prepareStatement(query);
                pa.setInt(1, accNumber);
                rs = pa.executeQuery();

                int i = 0;
                while (rs.next()) {
                    balanceRow = Double.parseDouble(rs.getString(7));
                    balanceArr[i] = balanceRow;
                    i++;
                }
                lastBalance = balanceArr[rowCount - 1];

            } catch (SQLException ex) {
                Logger.getLogger(calculateBalance.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No records to be found");
        }
        return lastBalance;
    }

    public boolean findObtainedLoan() {
        try {
            PreparedStatement pa;
            ResultSet rs;

            String query = "SELECT * FROM `loanAcceptors` WHERE `accountNumber` = ?";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            rs = pa.executeQuery();

            if (rs.next()) {
                totalLoan = Double.parseDouble(rs.getString(9));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(calculateBalance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public double getLoanToPay() {
        if (findObtainedLoan()) {
            try {
                PreparedStatement pa;
                ResultSet rs;

                String query = "SELECT * FROM `accStatement` WHERE `accountNumber` = ? && `description` = ?";
                pa = conn.prepareStatement(query);
                pa.setInt(1, accNumber);
                pa.setString(2, "Pay Loan");
                rs = pa.executeQuery();

                while (rs.next()) {
                    paidLoanAmount += Double.parseDouble(rs.getString(6));
                }
                loanToPay = totalLoan - paidLoanAmount;
                return loanToPay;

            } catch (SQLException ex) {
                Logger.getLogger(calculateBalance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int getRowCount() {
        try {
            PreparedStatement pa;
            ResultSet rs;

            String query = "SELECT COUNT(*) FROM `accStatement` WHERE `accountNumber` = ?";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            rs = pa.executeQuery();

            if (rs.next()) {
                rowCount = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(calculateBalance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }

    public boolean checkAccFixed() {
        try {
            PreparedStatement pa;
            ResultSet rs;

            String query = "SELECT * FROM `fixeddepositholders` WHERE `accountNumber` LIKE ?";
            pa = conn.prepareStatement(query);
            pa.setInt(1, accNumber);
            rs = pa.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(calculateBalance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
