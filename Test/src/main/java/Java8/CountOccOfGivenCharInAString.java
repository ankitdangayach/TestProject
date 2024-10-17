package Java8;

public class CountOccOfGivenCharInAString {

    public static void main(String[] args) {
        String str = "hello world";
        char c = 'l';

        System.out.println(count(str, c));
    }

    public static long count(String str, char c) {
        return str.chars().filter(ch -> ch == c).count();

    }


}
