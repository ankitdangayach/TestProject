package Search.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -13, -5, 0, 3, 5, 7, 8, 9, 15, 18, 20, 22};
        int target = -13;
        System.out.println(binarySearch(arr, target));
    }


    //return the index
    //return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start+end)/2; // might be possible that (start+end)
            // exceed the int range for big numbers , so the new formula is
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //answer found
                return mid;
            }
        }
        return -1;
    }
}

