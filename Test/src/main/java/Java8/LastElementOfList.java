package Java8;

import java.util.Arrays;
import java.util.List;

public class LastElementOfList {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().ifPresent(System.out::println);

    }
}
