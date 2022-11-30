package debugexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException{
        boolean isTriangle = (a > 0 & b > 0 & c > 0 && a + b > c && a + c > b && b + c > a);
        if (!isTriangle){
            throw new IllegalTriangleException("Invalid Triangle");
        }else {
            System.err.println("Valid Triangle");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter side a of triangle: ");
            int sideA = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter side b of triangle: ");
            int sideB = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the c of triangle: ");
            int sideC =  Integer.parseInt(scanner.nextLine());
            checkTriangle(sideA, sideB, sideC);
        }catch (InputMismatchException exception){
            System.out.println("Invalid Input");
        } catch (IllegalTriangleException e) {
            System.err.println("Triangle exception occur");
        }
    }
}
