import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int i =2;
        boolean flag=true;
        if (number >2){
            while (i<number){
                if (number%i==0){
                    flag= false;
                    break;
                }
                i++;
            }
        }else{
            flag=false;
        }
        if (flag)
            System.out.println(number + " is a prime");
        else System.out.printf(number + " is not a prime");
    }
}

