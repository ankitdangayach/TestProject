package Search.LinearSearch;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 0, 4};
        System.out.println(min(arr));
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
