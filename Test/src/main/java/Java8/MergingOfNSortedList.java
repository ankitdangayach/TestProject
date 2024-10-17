package Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingOfNSortedList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 4, 6, 7, 8, 10);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5);
        List<Integer> list3 = Arrays.asList(6, 8, 9);
        System.out.println(merge(list1, list2, list3));

        merge2(list1, list2, list3);
    }

    public static List<Integer> merge(List<Integer> l1, List<Integer> l2, List<Integer> l3) {
        return Stream.of(l1, l2, l3).flatMap(Collection::stream).distinct().sorted().collect(Collectors.toList());
    }

    public static void merge2(List<Integer> l1, List<Integer> l2, List<Integer> l3) {
        List<List<Integer>> sortedList = Arrays.asList(l1, l2, l3);
        sortedList.stream().flatMap(List::stream).distinct().sorted().forEach(s-> System.out.print(s + " "));
    }


}
