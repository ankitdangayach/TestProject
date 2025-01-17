package Search.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 0, 4};
        int target = 2;

        System.out.println(linearSearch(arr, target, 1, 5));
    }


    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            //Check for every element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
