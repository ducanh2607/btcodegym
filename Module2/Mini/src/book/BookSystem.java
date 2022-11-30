package book;

import java.util.Scanner;

public class BookSystem {
    private final BookManager bookManager;
    private final Scanner scanner;
    public BookSystem(){
        bookManager = new BookManager();
        scanner = new Scanner(System.in);
    }
    public void menuBookManager(){
        do {
            System.out.println("MENU");
            System.out.println("1.Creat book");
            System.out.println("2.Total price of all the books");
            System.out.println("3.Counting Java Book");
            System.out.println("4.Counting Fiction Book");
            System.out.println("5.Count the number of fiction books that cost less than 100");
            System.out.println("6.Display all books");
            System.out.println("7.Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    menuCreatBook();
                    break;
                case 2:
                    bookManager.sumPrice();
                    break;
                case 3:
                    bookManager.countJavaBook();
                    break;
                case 4:
                    bookManager.countFictionBook();
                    break;
                case 5:
                    bookManager.count100();
                    break;
                case 6:
                    bookManager.display();
                    break;
                case 7:
                    System.exit(7);
            }
        }while (true);
    }
    public void menuCreatBook(){
        int choice2;
        do{
            System.out.println("Choose the type of book you want to create");
            System.out.println("1.Normal book");
            System.out.println("2.Programming book");
            System.out.println("3.Fiction book");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice2 = Integer.parseInt(scanner.nextLine());
            if (choice2 == 4){
                break;
            }
            bookManager.add(choice2, scanner);
        }while (true);
    }
}
