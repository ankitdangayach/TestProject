package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseListOfIntegers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);

        List<Integer> reversedList = IntStream.range(0, list.size())
                .mapToObj(i -> list.get(list.size() - 1 - i))
                .toList();

        System.out.println("Reversed List: " + reversedList);

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);

        reverseListOfIntegers(list);
    }

    public static void reverseListOfIntegers(List<Integer> list ) {
        IntStream.range(0, list.size()).mapToObj(i-> list.get(list.size()-1-i)).forEach(System.out::print);
    }
}
