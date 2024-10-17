package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllTheNumbersStartingWith1 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        System.out.println(findAllTheNumbersStartingWith1(myList));
    }

    public static List<Integer> findAllTheNumbersStartingWith1(List<Integer> myList) {
        return myList.stream().filter(num -> String.valueOf(num).startsWith("1")).collect(Collectors.toList());
    }
}
