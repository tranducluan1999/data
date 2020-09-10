package Activity41;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private Connection connection ;

    public Service(Connection connection) {
        this.connection = connection;
    }


    public void getCounter()
    {
        List<Counter> counters = new ArrayList<>();
            String sql = "SELECT maker,COUNT(maker) FROM laptop GROUP BY maker ORDER BY COUNT(maker) DESC";
        try {
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                String maker =rs.getString(1);
                int quanity = rs.getInt(2);

                Counter counter = new Counter(maker, quanity);
                counters.add(counter);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(counters.toString());
    }
}
