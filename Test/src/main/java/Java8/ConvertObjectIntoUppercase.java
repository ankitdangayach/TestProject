package Java8;

import java.util.Arrays;
import java.util.List;

public class ConvertObjectIntoUppercase {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("aa","bb","cc","dd");
        myList.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
