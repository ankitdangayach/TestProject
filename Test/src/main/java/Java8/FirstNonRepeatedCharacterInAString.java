package Java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInAString {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        System.out.println(firstNonRepeatedCharacter(input));
        firstNonRepeatedCharacter2(input);
    }

    public static Character firstNonRepeatedCharacter(String input) {
        return input.chars().mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().orElse(null);
    }

    public static void firstNonRepeatedCharacter2(String input) {
        input = input.toLowerCase();
        input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().ifPresent(System.out::println);
    }
}
