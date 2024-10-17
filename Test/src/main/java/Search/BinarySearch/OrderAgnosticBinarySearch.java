package Search.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {56, 45, 34, 23, 12, 9, 6, 5, 0, -1, -4, -6, -8, -9, -11};
        int target = 115;
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find the array is sorted in asc or dsc

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //int mid = (start+end)/2; // might be possible that (start+end)
            // exceed the int range for big numbers , so the new formula is
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

