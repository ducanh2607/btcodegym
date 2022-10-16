
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        do {
            System.out.println("Menu");
            System.out.println("1.Delete element");
            System.out.println("2.Add element");
            System.out.println("3.Merge array");
            System.out.println("4.Find max element");
            System.out.println("5.Find min element");
            System.out.println("6.Count the number who passed");
            System.out.println("7.Sum of columns of array");
            System.out.println("8.Sum of diagonals of array");
            System.out.println("9.Count occurrences of char");
            System.out.println("10.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    DeleteElement();
                    break;
                case 2:
                    AddElement();
                    break;
                case 3:
                    MergeArray();
                    break;
                case 4:
                    FindMaxElement();
                    break;
                case 5:
                    FindMinElement();
                    break;
                case 6:
                    CountStudentsPass();
                    break;

                case 10:
                    System.exit(10);
            }
        }
        while (true);


    }

    static void DeleteElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter the element into array: ");
            int element = scanner.nextInt();
            arr[i] = element;
        }
        System.out.println("Enter the element to check");
        int elementCheck = scanner.nextInt();
        int index = 100;
        for (int i = 0; i < len; i++) {
            if (arr[i] == elementCheck) {
                index = i;
            }
        }
        if (index != 100) {
            for (int i = index; i < len - 1; i++) {
                arr[i] = arr[i + 1];
                arr[i + 1] = 0;
            }
        } else {
            System.out.println("Element " + elementCheck + " is not in array");
        }
        System.out.println(Arrays.toString(arr));

    }

    static void AddElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter the element into array: ");
            int element = scanner.nextInt();
            arr[i] = element;
        }
        System.out.println("Enter the index you want to add: ");
        int index = scanner.nextInt();
        while (index < 0 || index > len) {
            System.out.println("Enter the index you want to add: ");
            index = scanner.nextInt();
        }
        System.out.println("Enter the element you want to add: ");
        int element = scanner.nextInt();
        int[] newArr = new int[len+1];
        newArr[index] = element;
        System.arraycopy(arr,0,newArr,0,index);
        if (index < len){
            System.arraycopy(arr,index, newArr,index + 1,arr.length - 1);}
        System.out.println(Arrays.toString(newArr));
    }
    static void MergeArray(){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = new int[8];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
    static void FindMaxElement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];
        int max = arr[0][0];
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] =  (int) (Math.random()*(201)+100);
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    static void FindMinElement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];
        int min = arr[0][0];
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] =  (int) (Math.random()*(201)+100);
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
    static void CountStudentsPass(){
        int[] arr;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int len = scanner.nextInt();
        do {
            System.out.println("Enter the number of student: ");
            len = scanner.nextInt();
        }
        while (len > 30);
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 10);
            if (arr[i] >= 5){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

}
