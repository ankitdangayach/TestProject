package Questions.ExamQuestionsAgility;

import java.util.HashMap;
import java.util.Map;

class CountTheNumberOfOccOfFraction {

    public static void main(String[] args) {

        int[] X = {4, 4, 7, 1, 2};
        int[] Y = {4, 4, 8, 1, 2};

        int solution = solution(X, Y);
        System.out.println(solution);
    }
    public static int solution(int[] X, int[] Y) {
        // Implement your solution here

        int len = X.length;
        Map<String, Integer> fracCount = new HashMap<>();

        int maxCount = 0;
        for (int i = 0; i < len; i++) {
            int numer = X[i];
            int denom = Y[i];

            int gcd = gcd(numer, denom);
            numer /= gcd;
            denom /= gcd;

            if (denom < 0) {
                numer = -numer;
                denom = -denom;
            }

            String fractionKey = numer + "/" + denom;

            fracCount.put(fractionKey, fracCount.getOrDefault(fractionKey, 0) + 1);
            maxCount = Math.max(maxCount, fracCount.get(fractionKey));
        }
        return maxCount;
    }


    //Greatest common divisor
  /*  Euclidean Algorithm:
    It repeatedly replaces a with b and b with a % b until b becomes 0.
    The last non-zero value of a is the GCD.*/
    private static int gcd(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator;
        }
        return gcd(denominator, numerator % denominator);
    }



   /* public class GCDExample {
        public static void main(String[] args) {
            int num1 = 48;
            int num2 = 18;

            int gcd = gcd(num1, num2);
            System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        }

        // Method to calculate GCD using Euclidean algorithm
        public static int gcd(int a, int b) {
            // Ensure the inputs are non-negative
            a = Math.abs(a);
            b = Math.abs(b);

            // Apply Euclidean algorithm
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a; // GCD is the last non-zero remainder
        }
    }*/

    /*The time complexity of the given solution can be analyzed as follows:

Loop through the arrays: The outer loop iterates through the n elements of the arrays X and Y, where n is the length of the arrays. This gives us a complexity of
𝑂(𝑛)
O(n).

GCD calculation: The gcd function uses the Euclidean algorithm, which has a time complexity of
𝑂(log(min(𝑎,𝑏)))
O(log(min(a,b))). In the worst case, this could be considered constant time for practical inputs, but it can be approximated as
𝑂(log𝑀)
O(logM), where 𝑀M is the maximum value among the elements in X and Y.

String operations: Creating the string representation of the fraction (fractionKey) takes
𝑂(𝑘)
O(k), where 𝑘
k is the number of digits in the numerator and denominator. This can also be treated as constant time for practical input sizes, but can vary based on the size of the numbers.

HashMap operations: Inserting into and retrieving from the HashMap on average takes
𝑂(1)
O(1) time, but in the worst case (due to hash collisions), it could be
𝑂(𝑛)
O(n). However, with a good hash function, this is usually considered constant time.

Putting it all together, the overall time complexity can be simplified to:

𝑂(𝑛⋅log𝑀)
O(n⋅logM)
where
𝑀
M is the maximum value in X or Y.

Space Complexity
The space complexity is determined by:

Storage of fractions in the HashMap: In the worst case, if all fractions are unique, we can have up to
𝑂(𝑛)
O(n) unique entries in the HashMap.

Additional variables: The space used for variables is constant.

Thus, the space complexity is:

𝑂(𝑛)
O(n)
Summary
Time Complexity:
𝑂(𝑛⋅log𝑀)
O(n⋅logM)
Space Complexity:
𝑂(𝑛)
O(n)*/
}
