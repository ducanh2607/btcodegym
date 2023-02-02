package bai2;

import java.util.Scanner;

public class EmployeeSystem {
    private final Scanner scanner;
    private final EmployeeManager employeeManager;

    public EmployeeSystem(){
        scanner = new Scanner(System.in);
        employeeManager = new EmployeeManager();
    }
    public void menuEmployee(){
        do{
            System.out.println("Menu");
            System.out.println("1.Creat Employee");
            System.out.println("2.Upgrade employee information");
            System.out.println("3.Delete employee information");
            System.out.println("4.Display");
            System.out.println("4.Display");
            System.out.println("4.Display");
            System.out.println("4.Display");
            System.out.println("4.Display");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

        }while (true);
    }

}
