

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static Product[] arr = new Product[2];
    static int count = 0;
    static Product[] newArr = new Product[arr.length - 1];
    static int count1 =0;



    static void addProduct() {
        System.out.println("Enter product name: ");
        String name = scanner.next();
        System.out.println("Enter the price of the product: ");
        int price = scanner.nextInt();
        System.out.println("Enter the description of the product: ");
        String des = scanner.next();
        Product product = new Product(name, price, des);
        arr[count] = product;
        count++;
    }

    static void updateProduct() {
        System.out.println("Enter the product position you want to update(0-4): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new name( If you don't want please enter): ");
        String name = scanner.nextLine();
        if (name.equals("")) {
        } else {
            arr[index].setName(name);
        }
        System.out.println("Enter the new price( If you don't want please enter): ");
        String price = scanner.nextLine();
        if (price.equals("")) {
        } else {
            arr[index].setPrice(parseInt(price));
        }
        System.out.println("Enter the new description( If you don't want please enter): ");
        String descr = scanner.nextLine();
        if (descr.equals("")) {
        } else {
            arr[index].setDescription(descr);
        }
        System.out.println(arr[index].getPrice());
    }

    static void displayProduct() {
       if (count1 == 0){
           for (int i = 0; i < arr.length; i++) {
               System.out.println("Product name " + arr[i].getName() + " Product price " + arr[i].getPrice() + " Product description " + arr[i].getDescription());
           }
       }else{
           for (int i = 0; i < newArr.length; i++) {
               System.out.println("Product name " +  newArr[i].getName() + " Product price " +  newArr[i].getPrice() + " Product description " +  newArr[i].getDescription());
           }
       }
    }
    static void displayMaxPriceProduct(){
        int index =0;

        if (count1==0){
            int max = arr[0].getPrice();
            for (int i = 0; i < arr.length; i++) {
                if(max < arr[i].getPrice()){
                    max = arr[i].getPrice();
                    index = i;
                }
            }
            System.out.println("Product" + arr[index].getName() +"with the highest price " +arr[index].getPrice());
        }else{
            int max = newArr[0].getPrice();
            for (int i = 0; i < newArr.length; i++) {
                if (max < newArr[i].getPrice()){
                    max = newArr[i].getPrice();
                }
            }
            System.out.println("Product" + newArr[index].getName() +"with the highest price " + newArr[index].getPrice());
        }
    }
    static void deleteProduct() {
        Product[] newArr = new Product[arr.length - 1];
        System.out.println("Enter the product position you want to delete(0-4): ");
        int index = scanner.nextInt();
        count1++;
        switch (index) {
            case 0:
                System.arraycopy(arr, 1, newArr, 0, newArr.length);
                break;
            case 1:
            case 2:
            case 3:
                System.arraycopy(arr, 0, newArr, 0, index);
                System.arraycopy(arr,index + 1,newArr,index,newArr.length - index);
                break;
            case 4:
                System.arraycopy(arr, 0, newArr, 0, newArr.length);
                break;
        }

    }
}
