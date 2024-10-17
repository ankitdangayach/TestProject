package Java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str));
        System.out.println(reverse1(str));

        reverse2(str);
    }

    public static String reverse(String str) {
        return Stream.of(str).map(st -> new StringBuilder(st).reverse()).collect(Collectors.joining());
    }


    public static String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void reverse2(String str) {
        Stream.of(str).map(st->new StringBuilder(st).reverse()).forEach(System.out::println);
    }
}
