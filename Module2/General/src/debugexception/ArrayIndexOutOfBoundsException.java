package debugexception;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] creatRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException array = new ArrayIndexOutOfBoundsException();
        Integer[] arr = array.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the random element: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Value of element at index " + x + " is " + arr[x]);

        }catch (IndexOutOfBoundsException e){
            System.err.println("Index out of range");
        }
    }

}
