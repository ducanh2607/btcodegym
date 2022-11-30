package practicejavacollection;

public class Product {
    public String name;
    public String id;
    public double price;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name ='" + name + '\'' +
                ", id ='" + id + '\'' +
                ", price =" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
