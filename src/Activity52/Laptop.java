package Activity52;

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

    public Laptop(int id, int sold) {
    }

    public Laptop(int id, String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd, Long price, String card, String screenResolution, String screenSize, int sold, Timestamp created_timestamp, Timestamp lasted_updated_timestamp) {
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
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public Timestamp getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(Timestamp created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public Timestamp getLasted_updated_timestamp() {
        return lasted_updated_timestamp;
    }

    public void setLasted_updated_timestamp(Timestamp lasted_updated_timestamp) {
        this.lasted_updated_timestamp = lasted_updated_timestamp;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", maker='" + maker + '\'' +
                ", type='" + type + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ssd='" + ssd + '\'' +
                ", hdd='" + hdd + '\'' +
                ", price=" + price +
                ", card='" + card + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", sold=" + sold +
                ", created_timestamp=" + created_timestamp +
                ", lasted_updated_timestamp=" + lasted_updated_timestamp +
                '}';
    }
}
