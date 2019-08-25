package database.pack;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    public static void main(String[] args) {
        String DATABASE = "jdbc:mysql://localhost:3306/testdb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String USER = "root";
        String PASSWORD = "root";
        try {
          Connection connection = DriverManager.getConnection(DATABASE, USER, PASSWORD);
          if(!connection.isClosed()){
              System.out.println("Connection is online");
          }
        }
        catch (SQLException e){
            System.out.println("Error connecting to the database");
            e.printStackTrace();
        }
    }
}
