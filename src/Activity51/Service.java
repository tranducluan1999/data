package Activity51;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private Connection connection;

    public Service() {
    }

    public Service(Connection connection) {
        this.connection = connection;
    }

    public void insertLaptop(Laptop lt)
    {
       String sql =" insert into laptop(id, `name`, url, maker, `type`, " +
               "ram, `cpu`, ssd, hdd, price, card, screen_resolution, screen_size, sold ) " +
               "values ("+lt.getId() + ", "
               + lt.getName() + ", "
               + lt.getUrl() + ", "
               + lt.getMaker() + ", "
               + lt.getType() + ", "
               + lt.getRam() + ", "
               + lt.getCpu() + ", "
               + lt.getSsd() + ", "
               + lt.getHdd() + ", "
               + lt.getPrice() + ", "
               + lt.getCard() + ", "
               + lt.getScreenResolution() + ", "
               + lt.getScreenSize() + ", "
               + lt.getSold() + ") ";

        try {
            Statement stm = connection.createStatement();
            boolean rs = stm.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
    public void showLaptop()
    {
        List<Laptop > laptops = new ArrayList<>();
        String sql = "select * from laptop";
        try {
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {

                int id =rs.getInt(1);
                String name = rs.getString(2);
                String url =rs.getString(3);
                String maker = rs.getString(4);
                String type = rs.getString(5);
                String ram = rs.getString(6);
                String cpu = rs.getString(7);
                String ssd = rs.getString(8);
                String hdd = rs.getString(9);
                Long price = rs.getLong(10);
                String card = rs.getString(11);
                String screenResolution = rs.getString(12);
                String screenSize = rs.getString(13);
                int sold = rs.getInt(14);
                Laptop laptop = new Laptop(id, name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold);
                laptops.add(laptop);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(laptops.toString());

    }
}
