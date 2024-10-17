public class CountAndSayWithNumber {
    public static void main(String[] args) {
        int n = 5; // Change this to get different terms in the sequence
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String previousTerm = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1; // Initialize count
        char[] chars = previousTerm.toCharArray();

        // Iterate through the previous term to build the next term
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++; // Increment count if the same digit
            } else {
                // Append count and digit to result
                result.append(count).append(chars[i - 1]);
                count = 1; // Reset count for the new digit
            }
        }
        // Handle the last group of digits
        result.append(count).append(chars[chars.length - 1]);

        return result.toString();
    }
}

