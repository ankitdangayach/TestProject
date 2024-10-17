import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);
        int totalCount =10;

        int expectedSum = totalCount*(totalCount+1)/2;
        int actualSum = numbers.stream().mapToInt(Integer::intValue).sum();

        int difference = expectedSum-actualSum;
        System.out.println(difference);

      /*  int [] nums = {0, 1};
        *//*int [] nums = {3, 0, 1, 5, 2, 6, 4, 7};*//*
        int missing = findMissingNumber(nums);*/

    }

   /* public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        // Calculate the actual sum of numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        //Java 8 way adding of actual sum
        *//*int actualSum = Arrays.stream(nums).sum();*//*

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }*/


    /* List<Integer> numbers = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
        numbers.remove(Integer.valueOf(999999)); // Let's assume 999999 is missing
    int totalCount = 1000000;
    long expectedSum = (long) totalCount * (totalCount + 1) / 2;
    long actualSum = numbers.stream().mapToLong(Integer::longValue).sum();
    int missingNumber = (int) (expectedSum - actualSum);
        System.out.println("The missing number is: " + missingNumber);*/
}
