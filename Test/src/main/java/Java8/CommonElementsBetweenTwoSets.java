package Java8;

import java.util.Set;

public class CommonElementsBetweenTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3,4);
        Set<Integer> set2 = Set.of(7,6,2,8);

        findCommonElements(set1, set2);
    }

    public static void findCommonElements(Set<Integer> set1, Set<Integer> set2) {
        set1.stream().filter(set2::contains).forEach(System.out::println);
    }
}
