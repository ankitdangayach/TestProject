package Java8;

import java.util.Arrays;
import java.util.List;

public class CubeAListAndFilter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        cubeAListAndFilter(integerList);
    }

    /*Java 8 program to perform cube on list elements and filter numbers greater than 50.*/
    public static void cubeAListAndFilter(List<Integer> integerList) {
        integerList.stream().map(i -> i * i * i).filter(i -> i > 50).forEach(System.out::println);
    }
}
