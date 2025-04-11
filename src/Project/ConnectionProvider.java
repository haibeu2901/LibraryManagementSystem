/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;

/**
 *
 * @author beu29
 */
public class ConnectionProvider {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagementSystem", "root", "12345");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
