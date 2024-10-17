package Search.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {14, 18, 67, 56, 53, 34, 78, 87, -8, -11, 28};
        int target = 56;
        int ans = linearSearch2(nums, target);
        System.out.println(ans);

        boolean searchExists = linearSearch3(nums, target);
        System.out.println(searchExists);
    }

    //Search in the array: return the index if item found
    //otherwise if item not found return -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
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


    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        for (int element : arr) {
            //Check for every element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }

//search the target and return the true and false
    static boolean linearSearch3(int[] arr, int target) {
        for (int element : arr) {
            //Check for every element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return false;
    }
}
