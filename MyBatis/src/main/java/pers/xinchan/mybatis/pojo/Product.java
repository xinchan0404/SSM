package pers.xinchan.mybatis.pojo;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-11
 */
public class Product {
    private Integer id;
    private String name;
    private String vent;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVent() {
        return vent;
    }

    public void setVent(String vent) {
        this.vent = vent;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vent='" + vent + '\'' +
                ", price=" + price +
                '}';
    }
}
