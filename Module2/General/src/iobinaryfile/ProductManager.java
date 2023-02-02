package iobinaryfile;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

import java.util.Scanner;

public class ProductManager {
    private static ArrayList<Product> products;


    public ProductManager() {
        products = readToFile();
    }

    public void add(Scanner scanner) {
        System.out.println("Enter the id of product: ");
        String id = scanner.nextLine();
        System.out.println("Enter the name of product: ");
        String name = scanner.nextLine();
        System.out.println("Enter the brand of product: ");
        String brand = scanner.nextLine();
        System.out.println("Enter the price of product: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the describe of the product: ");
        String desc = scanner.nextLine();
        products.add(new Product(id,name,brand,price, desc));
        products = readToFile();
        writeToFile();

    }

    public void upgrade(Scanner scanner) {
        if (readToFile().size() == 0) {
            System.out.println("File don't have data.");
        } else {
            System.out.println("Enter the id of the product you want to delete: ");
            String id = scanner.nextLine();
            for (Product product : readToFile()) {
                if (product.getId().equals(id)) {

                    System.out.println("Enter the new id(Enter to skip): ");
                    String newId = scanner.nextLine();
                    if (!newId.equals("")) {
                        product.setId(newId);
                    }
                    System.out.println("Enter the new name(Enter to skip): ");
                    String newName = scanner.nextLine();
                    if (!newName.equals("")) {
                        product.setName(newName);
                    }
                    System.out.println("Enter the new brand(Enter to skip): ");
                    String newBrand = scanner.nextLine();
                    if (!newId.equals("")) {
                        product.setBrand(newBrand);
                    }
                    System.out.println("Enter the new price(Enter to skip): ");
                    String newPrice = scanner.nextLine();
                    if (!newId.equals("")) {
                        product.setPrice(Double.parseDouble(newPrice));
                    }
                    System.out.println("Enter the new describe(Enter to skip): ");
                    String desc = scanner.nextLine();
                    if (!newId.equals("")) {
                        product.setDescribe(desc);
                    }
                    writeToFile();
                }
            }
        }
    }

    public void delete(Scanner scanner) {
        products = readToFile();
        if (products.size() == 0) {
            System.out.println("File don't have data.");
        } else {
            System.out.println("Enter the id of the product you want to delete: ");
            String id = scanner.nextLine();
            for (Product product : products) {
                if (product.getId().equals(id)) {
                    products.remove(product);
                    writeToFile();
                }
            }
        }
    }

    public void display() {
        if (readToFile().size() == 0) {
            System.out.println("File don't have data.");
        } else {
            for (Product product : readToFile()) {
                System.out.println(product);
            }
        }
    }

    public static void writeToFile() {
        File file = new File("D:\\btcodegym\\Module2\\General\\src\\iobinaryfile\\product.txt");

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            objectOutputStream.writeObject(products);
            objectOutputStream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public  ArrayList<Product> readToFile() {
        File file = new File("D:\\btcodegym\\Module2\\General\\src\\iobinaryfile\\product.txt");
        ArrayList<Product> productArrayList = new ArrayList<>();
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0){
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                productArrayList = (ArrayList<Product>) objectInputStream.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return productArrayList;
    }
}
