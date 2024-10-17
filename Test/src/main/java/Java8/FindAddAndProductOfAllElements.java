package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindAddAndProductOfAllElements {

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(productOfAllElements());
        productOfAllElementsOnList(mylist);

        addAllElements(mylist);
    }

    public static Integer productOfAllElements() {
        return Stream.of(3, 2, 1, 4, 5).reduce(1, (product, element) -> product * element);
    }

    public static void productOfAllElementsOnList(List<Integer> myList) {
        myList.stream().reduce((a, b) -> a * b).ifPresent(System.out::println);
    }

    public static void addAllElements(List<Integer> list) {
        list.stream().reduce((a,b)->a+b).ifPresent(System.out::println);

    }

}
