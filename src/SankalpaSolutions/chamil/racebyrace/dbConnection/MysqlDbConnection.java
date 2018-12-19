/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Win 8
 */
public class MysqlDbConnection {
 private static MysqlDbConnection dbconnection;
    private Connection conn;

    private MysqlDbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/mathematica", "root", "");
        
    }
    
    public static MysqlDbConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dbconnection == null) {
         dbconnection = new MysqlDbConnection();
        }
        return dbconnection;

    }

   

    public Connection getConnection() {
        return conn;
    }
}
