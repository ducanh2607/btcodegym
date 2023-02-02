package product;

import java.io.Serializable;
import java.util.Locale;

public class Product implements Serializable {
    private static int INDEX = 0;
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private Category category;
    public Product(){}
    public Product(String name, Double price, Integer quantity, Category category){
        this.id = Long.valueOf(++INDEX);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        if(category == null){
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category=null" +
                '}';
    }
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            ", category=" + category +
            '}';}
    public void display(){
        if (category != null){
            System.out.printf("%-10s%-10s%-15s%-20s%s", id, name, price, quantity, category.getName() + "\n");
        }else {
            System.out.printf("%-10s%-10s%-15s%-20s%s", id, name, price, quantity, "null\n");
        }
    }

}
