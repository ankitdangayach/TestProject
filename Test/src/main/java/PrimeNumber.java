import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        /*System.out.print("Enter a number::");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));

        System.out.println("Prime via Java 8::" + isPrimeVia8(n));*/

        printAllPrimeNumbers();
    }


    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
/*
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;*/
        /*return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);*/
    }

    public static boolean isPrimeFo(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime
        }
        // Check for prime using trial division up to the square root of the number
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; // If number is divisible by i or i+2, it's not prime
            }
        }
        return true; // If number is not divisible by any smaller prime, it's prime
    }

    public static  boolean isPrimeVia8(int n) {
        return IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(index->n%index==0);
    }

    public static void printAllPrimeNumbers() {
        IntStream.rangeClosed(1, 100).filter(PrimeNumber::isPrimeVia8).forEach(System.out::println);
    }
}
