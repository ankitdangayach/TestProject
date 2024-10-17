package QuestionsFromLeetcode;

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int squareRoot = (int) Math.sqrt(a);
        System.out.println(squareRoot);
        int k = mySqrt(a);
        System.out.println(k);

    }


    public static int mySqrt(int x) {
        if (x == 0) return 0;

        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
