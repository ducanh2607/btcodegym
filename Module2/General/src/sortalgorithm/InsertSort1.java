package sortalgorithm;

import java.util.Arrays;

public class InsertSort1 {
    static int[] arr = {2, 4, 6, 9, 8, 5, 7};
    public static void insetSort(int[] arr){
        int index, x;
        for (int i = 1; i < arr.length; i++) {
            index = i;
            x = arr[i];
            while (index > 0 & x < arr[index - 1]){
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        insetSort(arr);
    }
}
