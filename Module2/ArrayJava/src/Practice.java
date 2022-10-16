import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        do {
            System.out.println("1. Thực hành 1");
            System.out.println("2. Thực hành 2");
            System.out.println("3. Thực hành 3");
            System.out.println("4. Thực hành 4");
            System.out.println("5. Thực hành 5");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    SortArray();
                    break;
                case 2:
                    FindElement();
                    break;
                case 3:
                    FindMaxElement();
                    break;
                case 4:
                    TemperatureTransfer();
                    break;
                case 5: FindMinElement();
                break;
                case 6:
                    System.exit(6);
            }
        }
        while (true);
    }

    static void SortArray() {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        size = scanner.nextInt();
        while (size != 20) {
            scanner = new Scanner(System.in);
            System.out.println("Enter size array: ");
            size = scanner.nextInt();
        }
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            scanner = new Scanner(System.in);
            System.out.println("Enter the element into the array: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void FindElement() {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String student = scanner.next();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                flag = true;
                System.out.println("Position of the student in the list " + student + " is: " + i);
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found " + student + "in the list.");
        }
    }

    static void FindMaxElement() {
        int max = 0;
        int index = 0;
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the element: ");
            int element = scanner.nextInt();
            if (max < element) {
                max = element;
                index = i;
            }
        }
        System.out.println("Max element is: " + max + " at position " + index);
    }

    static void TemperatureTransfer() {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
    static void FindMinElement(){
        int min = 0;
        int index = 0;
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the element: ");
            int element = scanner.nextInt();
            if (min > element) {
                min = element;
                index = i;
            }
        }
        System.out.println("Min element is: " + min + " at position " + index);
    }
}

