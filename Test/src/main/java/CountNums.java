import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        System.out.println("Enter the original number::");
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        System.out.println("The number is " + number);

        System.out.println("Enter the target number ::");
        Scanner in2 = new Scanner(System.in);
        long target = in2.nextLong();
        System.out.println("The target number is " + target);

        int count = 0;
        while (number > 0) {
            long remainder = number % 10;
            if (remainder == target) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
