package Questions.ExamQuestionsAgility;

public class LongestSwitchingSlice {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2, 3};
       /* int[] arr = {3, -7, 3, -7, 3};*/
       /* int[] arr = {7, -5, -5, -5, 7 , 1, -7};*/
        int longestSliceLength = findLongestSwitchingSlice(arr);
        System.out.println("Length of the longest switching slice: " + longestSliceLength);
    }

    /*public static int findLongestSwitchingSlice(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxLength = 1; // At least one element is there
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            // Check if the current element has a different sign than the last different one
            if ((arr[i] < 0 && arr[i - 1] > 0) || (arr[i] > 0 && arr[i - 1] < 0)) {
                currentLength++;
            } else if (arr[i] != arr[i - 1]) {
                // Reset current length to 2 if we switch after duplicates
                currentLength = 2;
            } else {
                // Reset the count if the sequence breaks
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1; // Reset for next potential slice
            }
        }

        // Final check in case the longest slice ends at the last element
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }*/

    public static int findLongestSwitchingSlice(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxLength = 1; // At least one element is there
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            // Check if current element has a different sign than the last different one
            if ((arr[i] < 0 && arr[i - 1] > 0) || (arr[i] > 0 && arr[i - 1] < 0)) {
                currentLength++;
            } else if (arr[i] != arr[i - 1]) {
                // Reset current length to 2 if there's a change in value but no sign change
                currentLength = 2;
            } else {
                // Reset the count if the sequence breaks
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1; // Reset for the next potential slice
            }
        }

        // Final check in case the longest slice ends at the last element
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }


   /* public class ExamQuestions.LongestSwitchingSlice {
        public static void main(String[] args) {
            int[] arr = {5, 5, 4, 5, 4}; // Change this array to test other cases
            int longestSliceLength = findLongestSwitchingSlice(arr);
            System.out.println("Length of the longest switching slice: " + longestSliceLength);
        }

        public static int findLongestSwitchingSlice(int[] arr) {
            if (arr.length == 0) {
                return 0;
            }

            int maxLength = 1; // At least one element is there
            int currentLength = 1;

            for (int i = 1; i < arr.length; i++) {
                // Check if we are at an even or odd index
                if ((i % 2 == 0 && arr[i] == arr[i - 2]) || (i % 2 == 1 && arr[i] == arr[i - 2])) {
                    currentLength++;
                } else {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 1; // Reset for the next potential slice
                }
            }

            // Final check in case the longest slice ends at the last element
            maxLength = Math.max(maxLength, currentLength);

            return maxLength;
        }
    }*/


}
