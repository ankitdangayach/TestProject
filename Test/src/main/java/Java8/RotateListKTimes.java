package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateListKTimes {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int k = 3;

        List<Integer> rotatedList = rotateList(list, k);
        System.out.println(rotatedList);

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        int K = 3; // Number of rotations

        // Rotate the array
        int[] rotatedArray2 = rotateArray(A, K);

        // Print the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray2));

        // Print the rotated array
        rotateArrayWithReverse(A, K);

        int[] rotatedArray = rotateArrayWithModulo(A, K);
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
    }

    public static List<Integer> rotateList(List<Integer> list, int k) {
        return Stream.concat(list.stream().skip(list.size() - k), list.stream().limit(list.size() - k)).collect(Collectors.toList());

    }

    public static int[] rotateArray(int[] array, int k) {
        int n = array.length;

//        // Normalize K to be within the bounds of the array length
//        k = k % n;

        // Create a List from the array and rotate using streams
        List<Integer> rotatedList = Arrays.stream(array)
                .boxed() // Convert int[] to Stream<Integer>
                .collect(Collectors.toList());

        // Rotate the list by using subList and concatenation
        rotatedList =
                Stream.concat(rotatedList.stream().skip(rotatedList.size() - k),
                        rotatedList.stream().limit(rotatedList.size() - k)).toList();;

        // Convert back to int[]
        return rotatedList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void rotateArrayWithReverse(int[] A, int K) {
        int n = A.length;
        if (n == 0) return;

        K = K % n; // In case K is greater than N
        reverse(A, 0, n - 1); //Reverse the whole array
        reverse(A, 0, K - 1); //Reverse the first K elements
        reverse(A, K, n - 1); //Reverse the remaining elements
    }

    private static void reverse(int[] A, int left, int right) {
        while (left < right) {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] rotateArrayWithModulo(int[] A, int K) {
        int N = A.length;
        if (N == 0) return A;

        K = K % N;
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[(i + K) % N] = A[i];

        }
        return result;
    }

}
