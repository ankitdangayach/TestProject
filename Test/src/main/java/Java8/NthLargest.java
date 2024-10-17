package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NthLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 8, 1, 6, 3, 4, 5, 2, 7);
        Integer n = 2;
        Integer nthLargest = nthLargest(list, n);
        System.out.println(nthLargest);
        nthLargestab(list, n);


        //In Array of Integers
        int[] arr = {5, 6, 7, 9, 1, 2 ,3};
        int num =3;

        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(num-1).findFirst().ifPresent(System.out::println);
    }

    public static Integer nthLargest(List<Integer> list, Integer n) {
        return list.stream().distinct().sorted(Comparator.reverseOrder()).peek(System.out::println)
                .skip(n - 1).findFirst().orElse(0);
    }

    public static void nthLargestab(List<Integer> list, Integer n) {
        list.stream().distinct().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().ifPresent(System.out::println);
    }
}
