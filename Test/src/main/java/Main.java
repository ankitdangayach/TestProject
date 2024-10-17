import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {

        
        /*find the length of the longest binary gap within a positive integer ( N ) using Java*/
        /*int N = 1041;
        String binaryString = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                counting = true;
                currentGap = 0;
            } else if (counting) {
                currentGap++;
            }
        }

        System.out.println(maxGap);*/

        /*given value is present at any even index of a list of integers java*/

        List<Integer> list = List.of(10, 20, 30, 40, 50);
        int value = 30;
        boolean match = IntStream.range(0, list.size()).filter(i -> i % 2 == 0).anyMatch(i -> list.get(i) == value);
        System.out.println(match);



        /*Find the Longest Common Prefix*/
       /* String[] strs = {"flower", "flow", "flight"}; // Example array of strings
        String longestPrefix = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + longestPrefix);*/


       /* Find the Maximum Subarray Sum
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array of numbers
        int maxSum = maxSubarraySum(nums);
        System.out.println("Maximum subarray sum: " + maxSum);*/


        //Count and Say
       /* String result = countAndSay(4);
        System.out.println(result);*/

        /*String testString = "aaaaabbbccccaaddd";

        Map<Character, Long> test = testString.chars().mapToObj(c -> (char) c)
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        test.forEach((k, v) -> System.out.print(k.toString() + v.toString()));*/


        //Convert string aaaaabbbccccaaddd to a5b3c4a2d3
        /*String input = "aaaaabbbccccaaddd";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(input.charAt(input.length() - 1)).append(count);

        System.out.println(result);*/


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string");
        String input = myObj.nextLine();
        String result = CountAndSay.compressString(input);
        System.out.println(result);
    }




    public static String countAndSay(int n) {
        if (n<=0) {
            return null;
        }
        String result = "1";
        int i=1;
        while (i++ < n) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j<result.length(); j++) {
                if(result.charAt(j) == result.charAt(j-1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            result = sb.toString();
        }

        return result;
    }


    public static int maxSubarraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // If the array is empty or null, return 0
        }
        int maxEndingHere = nums[0]; // Initialize maxEndingHere with the first element
        int maxSoFar = nums[0]; // Initialize maxSoFar with the first element
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]); // Calculate maximum ending at current index
            maxSoFar = Math.max(maxSoFar, maxEndingHere); // Update maximum subarray sum seen so far
        }
        return maxSoFar; // Return maximum subarray sum
    }



    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // If the array is empty or null, return an empty string
        }
        String prefix = strs[0]; // Initialize prefix with the first string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix length until it matches
                if (prefix.isEmpty()) {
                    return ""; // If prefix becomes empty, return an empty string
                }
            }
        }
        return prefix; // Return the longest common prefix
    }

}