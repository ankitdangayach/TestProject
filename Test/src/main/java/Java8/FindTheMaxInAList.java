package Java8;

import java.util.Arrays;
import java.util.List;

public class FindTheMaxInAList {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(findMaxInAList(myList));


        findMaxInALista(myList);
    }

    public static Integer findMaxInAList(List<Integer> myList) {
        return myList.stream().max(Integer::compareTo).get();
    }

    public static void findMaxInALista(List<Integer> myList) {
        myList.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}
