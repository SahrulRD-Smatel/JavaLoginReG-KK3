/**
 * JAVAnetBeans
 */

package Konfigurasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/javanetbeans";
        String user="root";
        String password="";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            System.out.println(e);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        try {
            Connection c = Koneksi.getConnection();
            System.out.println(String.format("Connected to database %s " + "successfully.", c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static Object getSqlConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
