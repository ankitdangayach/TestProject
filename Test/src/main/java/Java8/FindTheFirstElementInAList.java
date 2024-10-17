package Java8;

import java.util.Arrays;
import java.util.List;

public class FindTheFirstElementInAList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        firstElement(myList);
    }

    public static void firstElement(List<Integer> myList) {
        myList.stream().findFirst().ifPresent(System.out::println);
    }
}
