package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        /*System.out.println(Arrays.toString(reverseArray(arr)));*/

       /* reverseArrayWithSwap(arr);
        System.out.println(Arrays.toString(arr));*/

        System.out.println(Arrays.toString(reverseArrayJava8(arr)));



        Integer[] integers = {1, 2, 3, 4, 5, 6};
        Collections.reverse(Arrays.asList(integers));
        System.out.println(Arrays.toString(integers));

        /*Reversing an Object Array*/
        String[] words = {"one", "two", "three", "four", "five"};
        // Reverse the array
        Collections.reverse(Arrays.asList(words));

        System.out.println(Arrays.toString(words));
    }

    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }



    public static void reverseArrayWithSwap(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }



    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static int[] reverseArrayJava8(int[] arr) {
        // Convert to Integer[] for Collections.reverse
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Reverse the array
        Collections.reverse(Arrays.asList(integerArray));


        //Converting back to int[]
        return Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();

    }
}
