import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = scanner.nextInt();
        System.out.println("Enter number b:");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b==0){
            System.out.println("No greatest common divisor");
        }else {
            if (a == 0){
                System.out.println("Greatest common divisor is: " + b);
            }else{
                if (b == 0){
                System.out.println("Greatest common divisor is: " + a);}
            }
        }
        while (a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common divisor is: " + a);
    }
}
