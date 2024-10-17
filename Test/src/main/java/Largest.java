import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (b > max) {
            max = b;

        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);

        int[] nums = {1, 5, 3, 9, 7};
      /*  Arrays.sort(nums);

        System.out.println(nums[nums.length-1]);*/

       /* int max = Arrays.stream(nums).max().getAsInt();
        System.out.println(max);*/

       /* int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);*/

        /* find the largest number in an list of integers in Java. using stream*/
        List<Integer> arrayList
                = Arrays.asList(5, 3, 15, 234, 114, 1540);

     /*   arrayList.stream().max(Integer::compareTo).ifPresent(System.out::println);*/

        /*int maximum = arrayList.stream().max(Integer::compareTo).get();
        System.out.println(maximum);*/

       /* int max = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        System.out.println(max);*/

    }
}
