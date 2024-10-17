package Java8;

import java.util.stream.Collectors;

public class CheckStringsAreAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        String sortedStr1 = str1.chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());

        String sortedStr2 = str2.chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());

        if(sortedStr1.equals(sortedStr2)) {
            System.out.println("Strings are Anagrams");
        }
        else {
            System.out.println("Strings are not Anagrams");
        }
    }
}
