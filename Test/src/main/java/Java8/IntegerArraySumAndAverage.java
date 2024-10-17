package Java8;

import java.util.Arrays;

public class IntegerArraySumAndAverage {
    public static void main(String[] args) {
        int[] a =  {45, 12, 56, 15, 24, 75, 31, 89};

       int sum = Arrays.stream(a).sum();
        System.out.println("Sum->" + sum);

        Arrays.stream(a).average().ifPresent(avg-> System.out.println("Avg->" + avg));
    }
}
