package Acticivy32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Connected {
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

            //Scanner sc = new Scanner(System.in);
            FindLaptop laptop = new FindLaptop(connection);
            Long price1 = null, price2 = null;
            String maker = null, screenSize=null, ram=null, type=null,  card=null, sortUp=null, sortDown = null;
            boolean check =true;
            while (check)
            {
                System.out.println(" Bạn muốn tìm kiếm theo: ");
                System.out.println(" 1_Giá từ");
                System.out.println(" 2_Giá đến");
                System.out.println(" 3_Hãng");
                System.out.println(" 4_Kích thước màn hình");
                System.out.println(" 5_Cấu hình ram");
                System.out.println(" 6_Tên máy tính");
                System.out.println(" 7_Sắp xếp tăng dần");
                System.out.println(" 8_Sắp xếp giảm dần");
                System.out.println(" 8_Card màn hình");
                System.out.println(" 0_Kết thúc");
                System.out.println(" Mời bạn chọn: ");
                int n = sc.nextInt();
                switch (n)
                {
                    case 1:
                    {
                        System.out.println(" Nhập giá: ");
                        price1 =sc.nextLong();
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 2:
                    {
                        System.out.println(" Nhập giá: ");
                        price2 =sc.nextLong();
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 3:
                    {
                        System.out.println(" Nhập tên hãng: ");
                        maker = sc.nextLine();
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 4:
                    {
                        System.out.println(" Nhập kích thước màn hình: ");
                        screenSize = sc.nextLine();
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 5:
                    {
                        System.out.println(" Nhập kích thước Ram: ");
                        ram = sc.nextLine();
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 6:
                    {
                        System.out.println(" Nhập tên laptop: ");
                        type = sc.nextLine();
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 7:
                    {
                        sortUp = "aaa";
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 8:
                    {
                        sortDown="aaaaa";
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 9:
                    {
                        System.out.println(" Nhập loại Card màn hình: ");
                        card = sc.nextLine();
                        String sql = laptop.request(price1, price2, maker, screenSize, ram, type, card, sortUp, sortDown);
                        laptop.excuteSQL(sql);
                        break;
                    }
                    case 0:
                    {
                        check = false;
                        break;
                    }
                    default:
                    {
                        System.out.println(" Mời nhập lại!!!");
                    }


                }
            }
            

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console "  + e);
            return ;
        }
    }

}
