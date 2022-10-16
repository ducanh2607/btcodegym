import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        do {
            System.out.println("1. Show first 20 primes");
            System.out.println("2. Show primes less than 100");
            System.out.println("3. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    FirstTwentyPrimes();
                    break;
                case 2:
                    PrimesLessThan100();
                    break;
                case 3:
                    System.exit(3);
            }

        } while (true);
    }

    static void FirstTwentyPrimes() {
        int number = 3;
        int count = 0;
        while (count < 20) {
            boolean flag = true;
            if (number > 2) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.print("\n");
    }

    static void PrimesLessThan100() {
        int number = 3;
        while (number < 100) {
            boolean flag = true;
            if (number > 2) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.print("\n");
    }
}
