package book;

import com.sun.xml.internal.bind.v2.runtime.output.DOMOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private final ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }
    public void add(int choice, Scanner scanner){
        if(choice < 1 || choice > 4){
            System.out.println("The selection is not suitable, please re-enter");
        }else {
            System.out.println("Enter book code: ");
            String code = scanner.nextLine();
            System.out.println("Enter book name: ");
            String name = scanner.nextLine();
            System.out.println("Enter book author: ");
            String author = scanner.nextLine();
            System.out.println("Enter book price: ");
            double price = Double.parseDouble(scanner.nextLine());
            if (choice == 1){
                books.add(new Book(code, name, price, author));
            } else if (choice == 2) {
                System.out.println("Enter the language of the book: ");
                String language = scanner.nextLine();
                System.out.println("Enter the framework of the book: ");
                String frame = scanner.nextLine();
                books.add(new ProgrammingBook(code, name, price, author, language, frame));
            } else {
                System.out.println("Enter the genre of the book");
                String category = scanner.nextLine();
                books.add(new FictionBook(code, name, price, author, category));
            }
        }
    }
    public void sumPrice(){
        double sum = 0;
        for (Book book : books){
            sum +=  book.getPrice();
        }
        System.out.println("The total price of all the books is: " + sum);
    }
    public void display(){
        for (Book book : books){
            System.out.println(book);
        }
    }
    public void countJavaBook(){
        int count = 0;
        for (Book book : books){
            if (book instanceof ProgrammingBook){
                if (((ProgrammingBook) book).getLanguage().equals("Java")){
                    count ++;
                }
            }
        }
        System.out.println("The number of books which have the Java language is " + count);
    }
    public void countFictionBook(){
        int count = 0;
        for (Book book : books){
            if (book instanceof FictionBook){
                if (((FictionBook) book).getCategory().equals("Fiction 1")){
                    count ++;
                }
            }
        }
        System.out.println("The number of fiction books that have the category Fiction 1 is " +  count);
    }
    public void count100(){
        int count = 0;
        for (Book book : books){
            if (book instanceof FictionBook){
               if (book.getPrice() < 100){
                   count ++;
                }
            }
        }
        System.out.println("The number of fiction books that have a price less than 100 is " + count);
    }
}
