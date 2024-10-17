package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringWithPrefSuff {
    public static void main(String[] args) {

       /* Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?*/
        List<String> listOfStrings1 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings1.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joinedString);
    }
}
