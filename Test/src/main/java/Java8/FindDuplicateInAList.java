package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


//How to find duplicate elements in a given integers list in java using Stream functions*/
public class FindDuplicateInAList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        System.out.println(duplicateInList(myList));
        System.out.println(duplicateList2(myList));
    }

    public static List<Integer> duplicateInList(List<Integer> myList) {
        return myList.stream().
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
    }

    public static List<Integer> duplicateList2(List<Integer> myList) {
        Set<Integer> set = new HashSet<>();
        return myList.stream().filter(e -> !set.add(e)).collect(Collectors.toList());
    }

}
