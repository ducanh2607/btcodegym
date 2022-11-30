package bai3;

import java.util.Scanner;

public class MaterialSystem {
    private final Scanner scanner;
    private final MaterialManager materialManager;



    public  MaterialSystem() {
        this.scanner = new Scanner(System.in);
        this.materialManager = new MaterialManager();
    }

    public void menu() {
        do {
            System.out.println("Menu");
            System.out.println("1.Add");
            System.out.println("2.Upgrade");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            System.out.println("5.Display by discount");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    menuAdd(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    materialManager.delete(scanner);
                    break;
                case 4:
                    materialManager.display();
                    break;
                case 5:
                    materialManager.displayByDiscount();
                    break;
                case 0:
                    System.exit(0);

            }
        } while (true);

    }
    public void menuAdd(Scanner scanner){
        do{
        System.out.println("1.Add Meat");
        System.out.println("2.Add Crispy Flour");
        System.out.println("0.Exit");
        System.out.println("Enter your choice: ");
        int choiceAdd = -1;
        try{
            choiceAdd = Integer.parseInt(scanner.nextLine());

        }catch (NumberFormatException e){
            System.out.println("Wrong, please re-enter.");
        }
        if (choiceAdd == 0){
            break;
        }
        materialManager.add(choiceAdd, scanner);
    }while (true);
}
}
