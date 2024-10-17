import jdk.jshell.execution.JdiInitiator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysSumWithTarget {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
//        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] twoSum = twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));

        int[] twoSumWithHashMap = twoSumWithHashMap(nums, target);
        System.out.println(Arrays.toString(twoSumWithHashMap));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }

    public static int[] twoSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if(numMap.containsKey(difference)){
                return new int[] {numMap.get(difference), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
