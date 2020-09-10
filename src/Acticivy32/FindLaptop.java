package Acticivy32;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FindLaptop {

    private Connection connection;
    public String sql = null;

    public FindLaptop(Connection connection, String sql) {
        this.connection = connection;
        this.sql = sql;
    }

    public FindLaptop(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String request( Long price1, Long price2, String maker, String screenSize, String ram, String type, String  card, String sortUp, String sortDown)
    {

        String sql = "Select * from laptop ";
        if(price1 != null)
        {
            sql =sql + "where price >= " + price1;
        }
        else if(price2 !=null)
        {
            sql =sql + "where price <= " + price2;
        }
        else if(maker != null)
        {
            sql =sql + "where maker = " +"'" +maker+"'" ;
        }
        else if(screenSize != null)
        {
            sql =sql + "where maker = " +"'" +screenSize+"'" ;
        }
        else if(ram != null)
        {
            sql =sql + "where maker = " +"'" +ram+"'" ;
        }
        else if(type != null)
        {
            sql =sql + "where maker = " +"'" +type+"'" ;
        }
        else if(card != null)
        {
            sql =sql + "where maker = " +"'" +card+"'" ;
        }
        else if(sortUp != null)
        {
            sql =sql + "order by price ";
        }
        else if(sortDown != null)
        {
            sql =sql + "order by price desc";
        }
        return sql;


    }


    public List<Laptop> excuteSQL( String sql)
    {
        List<Laptop> laptopList = new ArrayList<>();

        try {
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                String name = rs.getString(2);
                String url =rs.getString(3);
                String maker = rs.getString(4);
                String type = rs.getString(5);
                String ram = rs.getString(6);
                String cpu = rs.getString(7);
                String ssd = rs.getString(8);
                String hdd = rs.getString(9);
                float price = rs.getFloat(10);
                String card = rs.getString(11);
                String screenResolution = rs.getString(12);
                String screenSize = rs.getString(13);
                int sold = rs.getInt(14);
                Laptop laptop = new Laptop(name, url, maker, type, ram, cpu, ssd, hdd, price, card, screenResolution, screenSize, sold);
                laptopList.add(laptop);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return laptopList;

    }








}
