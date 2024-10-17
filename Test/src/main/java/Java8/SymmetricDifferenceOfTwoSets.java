package Java8;

import java.util.Set;
import java.util.stream.Stream;

public class SymmetricDifferenceOfTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of(3, 4, 5, 6);

        findSymmetricDifference(set1, set2);
    }

    public static void findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Stream.concat(set1.stream().filter(e -> !set2.contains(e)),
                set2.stream().filter(e -> !set1.contains(e))).forEach(System.out::println);
    }

    //Output will be 2,1,6,5
}
