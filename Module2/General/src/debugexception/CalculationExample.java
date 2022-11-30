package debugexception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter x: ");
        int x = scanner.nextInt();
        System.out.println("PLease enter y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }
    public void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum of x and y: " + a);
            System.out.println("Sub of x and y: " + b);
            System.out.println("Multiplication of x and y: " + c);
            System.out.println("Division of x and y: " + d);

        }catch (Exception e){
            System.err.println("An exception occurs: " + e.getMessage());
        }
    }
}
