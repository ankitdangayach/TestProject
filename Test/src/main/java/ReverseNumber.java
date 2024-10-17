import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to reverse::");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long reversed = 0;
        while (n > 0) {
            long rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }
        System.out.println(reversed);

    }
}
