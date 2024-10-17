package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
/*        sort(myList);
        System.out.println("*****************************************");*/
        reverseOrder(myList);
    }

    public static void sort(List<Integer> myList) {
        myList.stream().sorted().forEach(System.out::println);
    }

    /*Given a list of integers, sort all the values present in it in descending order using Stream functions?*/
    public static void reverseOrder(List<Integer> myList) {
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }


    /* How do you sort the given list of decimals in reverse order?*/
        /*List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);*/
}
