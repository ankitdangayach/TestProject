package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class FindADuplicateInAArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 7};
        System.out.println(duplicateInAArray(nums));
        System.out.println(Arrays.toString(duplicateEleInAArray(nums)));
    }

    /*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/
    public static boolean duplicateInAArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).anyMatch(num -> !set.add(num));
    }

    public static int[] duplicateEleInAArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).filter(num -> !set.add(num)).toArray();
    }

    public static boolean duplicateInAArrayintest(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        return Arrays.stream(nums).anyMatch(num->!integers.add(num));
    }
}
