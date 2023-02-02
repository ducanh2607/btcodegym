package product;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products;
    public ProductManager(){
        products = readFile();
    }
    private ArrayList<Product> readFile(){
        File file = new File("D:\\btcodegym\\Module2\\Mini\\src\\product\\product.txt");
        ArrayList<Product> productArrayList = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0){
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                productArrayList = (ArrayList<Product>) objectInputStream.readObject();
            }
            return productArrayList;
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return productArrayList;
    }
    public void add(ArrayList<Category> categories, Scanner scanner){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter quantity: ");
        Integer quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Category: ");
//        Category category =
    }
}
