import java.util.Arrays;

public class PassByValueForObjects {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 6};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void change(int[] nums) {
        nums[0] = 87;
    }
}
