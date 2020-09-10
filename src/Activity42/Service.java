package Activity42;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private Connection connection;

    public Service() {
    }

    public Service(Connection connection) {
        this.connection = connection;
    }

    public void getStatistic(){
        List<Statistic> statistics=new ArrayList<>();
        String sql="SELECT maker,price,COUNT(maker) FROM laptop GROUP BY maker";
        try {
            Statement stm=connection.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next()){
                String maker=rs.getString(1);
                long totalMoney=rs.getLong(2);
                int quantity=rs.getInt(3);
                statistics.add(new Statistic(maker, (int) totalMoney,quantity));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(statistics.toString());
    }
}
