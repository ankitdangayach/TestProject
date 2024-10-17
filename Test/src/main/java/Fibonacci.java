import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Find the nth number from fibonacci series");
        System.out.print("Enter the number to find in series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       /* int a = 0, b = 1;
       *//* for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }*//*

        int count = 2;
        while (count <= n) {
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(b);*/

        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a=0, b=1;
        int sum =0;
        System.out.println("Fibonacci series: ");
        for (int i = 0; i <n; i++) {
            System.out.print(a + " ");
            sum = sum+a;
            int next = a +b;
            a=b;
            b=next;
        }

        System.out.print("\nSum " +sum);
    }


    public static void fibonacciNumber(int N) {
        /* Scanner scnr = new Scanner(System.in);
        int N = scnr.nextInt();*/
       /* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, … (considering 1 - indexing)

        Therefore, in general, the nth term of the series can be written as

        F(n) = F(n - 1) + F(n - 2)*/
        int first = 0; // first fibonacci number
        int second = 1; // second fibonacci number

// handling the corner cases when the N is 0 or negative. Note that we are treating this
// series with 1-indexing.
        if (N <= 0) {
            System.out.println("N can never be zero or negative");
            return;
        }

// if the user input is either 1 or 2
        if (N == 1) {
            System.out.println(first);
        } else if (N == 2) {
            System.out.println(second);
        } else {
// loop for the Nth fibonacci numbers
            int curr = 0;
            for (int j = 3; j <= N; j++) {
                curr = first + second;
                first = second;
                second = curr;
            }
            System.out.println("The " + N + "th Fibonacci number is: " + curr);
        }
    }
}
