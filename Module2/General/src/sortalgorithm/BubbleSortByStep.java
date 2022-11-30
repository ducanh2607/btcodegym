package sortalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list  = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list " + Arrays.toString(list));
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
               if(list[j] > list[j+1]){
                   int temp = list[j];
                   list[j] = list[j+1];
                   list[j+1] = temp;
                   needNextPass = true;
               }
            }
            if(needNextPass == false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + i + "times sort: " + Arrays.toString(list));
        }

    }
}
