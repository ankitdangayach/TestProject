package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllTheEvenNumbersInAList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        System.out.println(findAllEvenNumbersInAList(list));
    }

    public static List<Integer> findAllEvenNumbersInAList(List<Integer> list) {
        return list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }
}
