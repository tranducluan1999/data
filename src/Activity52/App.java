package Activity52;

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

            // update laptop
            System.out.println(" nhập mã id của laptop: ");
            int id =sc.nextInt();

            System.out.println(" Nhập số lượng bán: ");
            int sold =sc.nextInt();
            Laptop lt = new Laptop(id, sold);
            Service service = new Service(connection);
            service.updateLaptop(lt);
            service.showLaptop();

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console "  + e);
            return ;
        }
    }
}
