import java.util.Scanner;
import java.util.stream.IntStream;

public class Armstrong {
    public static void main(String[] args) {
        armstrongNumber();
        armstrongNumberJava8();
    }

    public static void armstrongNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: "); //1, 153 370, 371, 407
        int num = in.nextInt();
        int original = num;
        int sum = 0;
        /*int numberOfDigits = String.valueOf(num).length();*/
        while (num > 0) {
            int remainder = num % 10;
            sum = sum + (remainder * remainder * remainder);
            /* sum = (int) (sum + Math.pow(remainder, numberOfDigits));*/
            num = num / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }

    public static void armstrongNumberJava8() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: "); //1, 153 370, 371, 407
        int num = in.nextInt();
        String numStr = Integer.toString(num);
        int length = numStr.length();
        int sum = IntStream.range(0, length)
                .map(i -> (int) Math.pow(Character.getNumericValue(numStr.charAt(i)), length))
                .sum();

        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}

