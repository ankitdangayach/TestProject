package Array;

import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 5};

        System.out.println(max(arr));

        System.out.println(maxWithJava8(arr));

        System.out.println(maxRange(arr, 2, 4));
    }

    public static int max(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxWithJava8(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow(()->new IllegalArgumentException("Array is empty"));
    }

    public static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
