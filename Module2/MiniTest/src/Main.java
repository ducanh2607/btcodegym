import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*do{
            System.out.println("1.Add product");
            System.out.println("2.Update product");
            System.out.println("3.Delete product");
            System.out.println("4.Display product with highest price");
            System.out.println("5.Display product");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.updateProduct();
                    break;
                case 3:
                    ProductManager.deleteProduct();
                    break;
                case 4:
                    ProductManager.displayMaxPriceProduct();
                    break;
                case 5:
                    System.exit(5);
            }

        }while(true);*/
        ProductManager productManager = new ProductManager();
        System.out.println(productManager.);
    }
}