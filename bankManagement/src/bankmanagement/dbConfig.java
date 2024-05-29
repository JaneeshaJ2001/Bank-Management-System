/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement;

//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
/**
 *
 * @author Janeesha
 */
public class dbConfig {
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String password = "";
    private static String dbName = "bank_management_system";
    private static Integer port = 3307;
    
    public static Connection getConnection(){
        Connection con = null;

        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(serverName);
        datasource.setUser(userName);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(port);

        try{
            con = datasource.getConnection();
            System.out.println("Connection Sucsses");
            return con;

        } catch (SQLException ex) {
            System.out.println("Connection Error");
            JOptionPane.showMessageDialog(null, "Connetion Error", "Error", 2);
            Logger.getLogger(" Get Connection -> " + dbConfig.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    
    }

    
}
