package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinFromList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers1.stream().max(Comparator.naturalOrder()).ifPresent(s-> System.out.println("Max number::"+s));

        listOfIntegers1.stream().min(Comparator.naturalOrder()).ifPresent(s-> System.out.println("Min number::"+s));

    }
}
