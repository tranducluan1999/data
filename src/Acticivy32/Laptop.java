package Acticivy32;

import java.sql.Timestamp;

public class Laptop {

    private int id;
    private String name;
    private String url;
    private String maker;
    private String type;
    private String ram;
    private String cpu;
    private String ssd;
    private String hdd;
    private Long price;
    private String card;
    private String screenResolution;
    private String screenSize;
    private int sold;
    private Timestamp created_timestamp;
    private Timestamp lasted_updated_timestamp;
    private Long fromPrice;
    private Long toPrice;
    private String sort;

    public Laptop(int id, String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd, Long price, String card, String screenResolution, String screenSize, int sold, Timestamp created_timestamp, Timestamp lasted_updated_timestamp, Long fromPrice, Long toPrice, String sort) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.maker = maker;
        this.type = type;
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
        this.hdd = hdd;
        this.price = price;
        this.card = card;
        this.screenResolution = screenResolution;
        this.screenSize = screenSize;
        this.sold = sold;
        this.created_timestamp = created_timestamp;
        this.lasted_updated_timestamp = lasted_updated_timestamp;
        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
        this.sort = sort;
    }

    public Laptop(String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd, float price, String card, String screenResolution, String screenSize, int sold) {
    }


}
