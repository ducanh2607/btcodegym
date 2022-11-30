package practicejavacollection;

import java.util.Scanner;

public class ProductSystem {
    private final ProductManager productManager;
    private final Scanner scanner;

    public ProductSystem() {
        this.productManager = new ProductManager();
        this.scanner = new Scanner(System.in);
    }

    public void menuProductManager() {
        do {
            System.out.println("MENU");
            System.out.println("1.Add Product");
            System.out.println("2.Upgrade Product");
            System.out.println("3.Delete Product");
            System.out.println("4.Search Product");
            System.out.println("5.Sort Product Ascending");
            System.out.println("6.Sort Product Descending");
            System.out.println("7.Display list of product");
            System.out.println("8.Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    productManager.editProduct(scanner);
                    break;
                case 3:
                    productManager.deleteProduct(scanner);
                    break;
                case 4:
                    productManager.searchProduct(scanner);
                    break;
                case 5:
                    productManager.sortAsc();
                    break;
                case 6:
                    productManager.sortDsc();
                    break;
                case 7:
                    productManager.display();
                    break;
                case 8:
                    System.exit(8);

            }
        } while (true);
    }


}
