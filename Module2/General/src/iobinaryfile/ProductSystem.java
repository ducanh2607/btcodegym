package iobinaryfile;

import java.util.Scanner;

public class ProductSystem {
    private Scanner scanner;
    private ProductManager productManager;
    public ProductSystem(){
        this.scanner = new Scanner(System.in);
        this.productManager = new ProductManager();
    }


    public void menuProduct(){
        do{
            System.out.println("Menu");
            System.out.println("1.Add Product");
            System.out.println("2.Upgrade Product");
            System.out.println("3.Delete Product");
            System.out.println("4.Display Product");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    productManager.add(scanner);
                    break;
                case 2:
                    productManager.upgrade(scanner);
                    break;
                case 3:
                    productManager.delete(scanner);
                    break;
                case 4:
                    productManager.display();
                    break;
            }

        }while (true);

    }
}
