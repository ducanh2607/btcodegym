package practicejavacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    public static ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Scanner scanner) {

        System.out.println("Enter the name of the product: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the product: ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the id of the product: ");
        String id = scanner.nextLine();
        Product product = new Product(name, id, price);
        products.add(product);
    }

    public void display() {
        if (products.size() == 0) {
            System.out.println("The list has no product to display.");
        } else {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i).toString());
            }
        }
    }

    public void deleteProduct(Scanner scanner) {
        if (products.size() == 0) {
            System.out.println("The list has no product to delete.");
        } else {
            System.out.println("Enter the id of product you want to delete");
            String idDelete = scanner.nextLine();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(idDelete)) {
                    products.remove(i);
                    break;
                }
            }
        }
    }

    public void editProduct(Scanner scanner) {
        if (products.size() == 0) {
            System.out.println("The list has no product to delete.");
        } else {
            System.out.println("Enter the id of product you want to edit: ");
            String idEdit = scanner.nextLine();

            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(idEdit)) {
                    System.out.println("New name(Enter if you dont want edit): ");
                    String name = scanner.nextLine();
                    if (!name.equals("")) {
                        products.get(i).setName(name);
                    }
                    System.out.println("New price(Enter if you dont want edit): ");
                    String price = scanner.nextLine();
                    if (!price.equals("")) {
                        products.get(i).setPrice(Double.parseDouble(price));
                    }
                    System.out.println("New id(Enter if you dont want edit): ");
                    String id = scanner.nextLine();
                    if (!id.equals("")) {
                        products.get(i).setId(id);
                    }
                    break;
                }
            }
        }
    }

    public void searchProduct(Scanner scanner) {
        if (products.size() == 0) {
            System.out.println("The list has no product to search");
        } else {
            System.out.println("Enter the name of product you want to search");
            String nameSearch = scanner.nextLine();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getName().equals(nameSearch)) {
                    products.get(i).toString();
                    break;
                }
            }
            System.out.println("The product not in list");
        }
    }

    public void sortAsc() {
        PriceComparatorAsc priceComparatorAsc = new PriceComparatorAsc();
        Collections.sort(products, priceComparatorAsc);
        System.out.println("Ascending: ");
        for (Product st : products) {
            System.out.println(st.toString());
        }
    }

    public void sortDsc() {
        PriceComparatorDsc priceComparatorDsc = new PriceComparatorDsc();
        Collections.sort(products, priceComparatorDsc);
        System.out.println("Descending: ");
        for (Product st : products) {
            System.out.println(st.toString());
        }
    }


}
