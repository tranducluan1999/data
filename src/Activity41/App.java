package Activity41;

import Acticivy32.FindLaptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                    "store_cms_plusplus?characterEncoding=utf8", "root", "Anhluankk1999");
            System.out.println("SQL Connection to database established!");
            Service cs  = new Service(connection);
            cs.getCounter();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console "  + e);
            return ;
        }
    }
}
