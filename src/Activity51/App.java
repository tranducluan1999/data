package Activity51;

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
            // thêm laptop

            Service service = new Service(connection);
            System.out.println("-----Thêm Laptop-----");
            System.out.println( " Nhập id: ");
            int id =sc.nextInt();
            sc.nextLine();

            System.out.println(" Nhập tên Laptop: ");
            String name =sc.nextLine();

            System.out.println(" Nhập Url: ");
            String url =sc.nextLine();

            System.out.println(" Nhập Maker: ");
            String maker = sc.nextLine();

            System.out.println(" Nhập Type: ");
            String type = sc.nextLine();

            System.out.println(" Nhập Ram: ");
            String ram  = sc.nextLine();

            System.out.println(" Nhập CPU: ");
            String cpu = sc.nextLine();

            System.out.println(" Nhập SSD: ");
            String ssd =sc.nextLine();

            System.out.println(" Nhập HDD: ");
            String hdd =sc.nextLine();

            System.out.println(" Nhập Price: ");
            Long price =sc.nextLong();
            sc.nextLine();

            System.out.println(" Nhập Card: ");
            String card  =sc.nextLine();

            System.out.println(" Nhập Sreen Resolution: ");
            String screenResolution =sc.nextLine();

            System.out.println(" Nhập Sceen Size: ");
            String screenSize =sc.nextLine();

            System.out.println(" Nhập số lượng bán: ");
            int sold =sc.nextInt();
            Laptop laptop =new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold);
            service.insertLaptop(laptop);
            service.showLaptop();


        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console "  + e);
            return ;
        }
    }
}
