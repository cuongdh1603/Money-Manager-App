/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Cuong
 */
public class JDBCConnection {
    private static final String sql = "jdbc:mysql://localhost:3306/javacore18";
    private static final String root = "root";
    private static final String password = "cuong#Super2001";
    public static Connection getJDBCConnection() throws SQLException{
        Connection conn = DriverManager.getConnection(sql, root, password);
        return conn;
    }
}
