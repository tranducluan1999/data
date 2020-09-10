package Activity41;

import java.sql.Connection;

public class Counter {
    private String maker;
    private int quanity;

    public Counter() {

    }

    public Counter(String maker, int quanity) {
        this.maker = maker;
        this.quanity = quanity;
    }

    public Counter(Connection connection) {
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "maker='" + maker + '\'' +
                ", quanity=" + quanity +
                '}';
    }
}
