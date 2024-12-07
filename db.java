 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aakriti
 */
public class db {
  
    public static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root"; 
        String password = "";    

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
        }
        return connection;
    }
}

