import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double money = scanner.nextDouble();
        System.out.print("Enter the number of months: ");
        int month = scanner.nextInt();
        double interestRate = 5.0;
        double profit = 0;
        for (int i = 1;i <= month; i++){
            profit += money *  interestRate / 1200  * month;
        }
        System.out.printf("%s%d%s%.2f", "Inter rest after ", month," months of deposit is: ",profit);
    }
}
