package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitionSetOfNumbers {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, Set<Integer>> partition = partitionEvenOdds(set1);
        System.out.println(partition);

        System.out.println(partitionEvenOddsForList());

        //odd set
        partition.entrySet().stream().filter(k->!k.getKey()).forEach(System.out::println);

        //even set
        partition.entrySet().stream().filter(k->k.getKey()).forEach(System.out::println);
    }

    public static Map<Boolean, Set<Integer>> partitionEvenOdds(Set<Integer> set1) {
        return set1.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.toSet()));
    }

    public static Map<Boolean, List<Integer>> partitionEvenOddsForList() {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

       return listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0, Collectors.toList()));
    }

}
