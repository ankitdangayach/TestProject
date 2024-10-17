import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DuplicateNumbersAndSum {
    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3, 7, 3, 5, 7};

        int[] duplicate = duplicateNumbers(nums);
        System.out.println(Arrays.toString(duplicate));
        int sum = 0;
        for (int dup : duplicate) {
            sum = sum + dup;
        }
        System.out.println(sum);
    }

    public static int[] duplicateNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).filter(el -> !set.add(el)).toArray();
    }
}