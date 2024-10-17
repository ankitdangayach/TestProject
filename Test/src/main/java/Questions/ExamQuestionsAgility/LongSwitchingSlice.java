package Questions.ExamQuestionsAgility;

public class LongSwitchingSlice {

    public static void main(String[] args) {

        /*we call an array switching if all numbers in even positions are equal and all numbers in odd positions are equal

        for Example [3, -7, 3, -7, 3] and [4,4,4] are switching, but [5,5,4,5,4] and [-3, 2, 3] are not switching

        what is the length of the longest switching slice(continues fragment) in a given array A?*/


       /*
        int maxLength = solution(A);
        System.out.println(maxLength);*/

        /* int[] A = {3, 2, 3, 2, 3};*/

          int[] A = {3, -7, 3, -7, 3};

       /* int[] A = {3, 3, 3, 3, -7, 3, -7, 3};*/

        /* int[] A = {7, -5, -5, -5, 7 , -1, 7};*/

       /* int[] A = {7, 4, -2, 4, -2, 9};*/

        /*  int[] A = {4};*/

        /*  int[] A = {4,4,4};*/

       /* int[] A = {5, 5, 4, 5, 4};*/

        /*int[] A = {5, 5, 4, 5 ,4};*/


        System.out.println("Length of the longest switching slice: " + solve(A));
    }


    public static int longestSwitchingSlice(int[] A) {
        if (A.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < A.length; i++) {
            if ((i % 2 == 0 && A[i] == A[i - 2]) || (i % 2 != 0 && A[i] == A[i - 2])) {
                currentLength++;
            } else {
                currentLength = 2; // Reset to 2 because a new slice starts with the current and previous element
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }


    public static int solution(int[] A) {
        // Implement your solution here
        int len = A.length;

        int presentLen = 1;
        int maxLen = 1;

        if (len == 1) return 1;

        for (int i = 1; i < len; i++) {
            if ((i % 2 == 0 && A[i] == A[i - 2]) || (i % 2 == 1 && A[i] == A[len - 2])) {
                presentLen++;
            } else {
                presentLen = 2;
            }
            maxLen = Math.max(presentLen, maxLen);
        }
        return maxLen;
    }


    private static int solve(int[] arr) {
        if (arr.length == 1) return 1;
        int even = arr[0], odd = arr[1];
        int start = 0, max_len = 0;
        for (int i = 2; i < arr.length; ++i) {
            if (i % 2 == 0 && arr[i] != even || i % 2 == 1 && arr[i] != odd) {
                max_len = Math.max(max_len, i - start);
                start = i - 1;
                if (i % 2 == 0) {
                    even = arr[i];
                    odd = arr[i - 1];
                } else {
                    even = arr[i - 1];
                    odd = arr[i];
                }
            }
        }


        return Math.max(max_len, arr.length - start);
    }

    /* Time Complexity
            Loop Iteration: The loop iterates through the array starting from index 2 up to arr.length - 1,
            which means it runs n - 2 times, where n is the length of the array. This gives a time complexity of
            𝑂(𝑛)

            Constant Time Operations: Inside the loop, operations like comparisons, assignments, and calls to Math.max are all
            𝑂(1)
    */

}
