import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reverse {
    public static void main(String[] args) {
        String str = "Hello, world!";

        /*String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);*/

        /*List<String> reverse = Arrays.asList(str.split(""));
        System.out.println(reverse);
        Collections.reverse(reverse);
        System.out.println(reverse);
        System.out.println(reverse.stream().collect(Collectors.joining()));*/

/*
        String reversedStr = Stream.of(str).map(rev->new StringBuilder(rev).reverse()).collect(Collectors.joining());
        System.out.println(reversedStr);

        String reversedStrWordByWord = Stream.of(str.split(" ")).map(rev->new StringBuilder(rev).reverse()).collect(Collectors.joining( " "));
        System.out.println(reversedStrWordByWord);*/

        String reversedStr  = Arrays.stream(str.split("")).map(m->new StringBuilder(m).reverse()).collect(Collectors.joining());
        System.out.println(reversedStr);


        /* Reverse an integer array*/
       int[] array = new int[]{5, 1, 7, 3, 9, 6};

       int[] reversedArray =  IntStream.rangeClosed(1, array.length).map(i -> array[array.length-i]).toArray();
       System.out.println(Arrays.toString(reversedArray));

        System.out.println(reverseString(str));
    }


    public static String reverseString(String str) {
       char[] chars = str.toCharArray();
       int start = 0;
       int end = str.length()-1;

       while(start<end) {
           char temp = chars[start];
           chars[start] = chars[end];
           chars[end] = temp;
           start++;
           end--;
       }
       return new String(chars);
    }
}
