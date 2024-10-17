package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreqOfCharInList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Map<Character, Long> charCount = charCount(list);
        System.out.println(charCount);
    }

    public static Map<Character, Long> charCount(List<String> list) {
        return list.stream().flatMap(str-> str.chars().mapToObj(c->(char)c)).peek(System.out::println)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }
}
