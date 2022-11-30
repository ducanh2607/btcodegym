package sortalgorithm;

import java.util.Arrays;

public class InsertionSort {
    static double[] arr = {1, 5.5, 8, 1, 2,9};
    public static void  insertionSort(double[] arr){
        int index;
        double x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            index = i;
            while(index > 0 & x < arr[index-1]){
                arr[index]  = arr[index - 1];
                index--;
            }
            arr[index] = x;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
    }
}
