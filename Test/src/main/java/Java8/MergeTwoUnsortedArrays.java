package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrays {

    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 1};

        int[] b = new int[]{8, 3, 9, 5};

        int[] c = new int[] {4, 2, 5, 1};

        int[] d = new int[] {8, 1, 9, 5};

        IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().forEach(System.out::println);

        System.out.println("***************************************************************");

        IntStream.concat(Arrays.stream(c), Arrays.stream(d)).distinct().sorted().forEach(System.out::println);
    }
}
