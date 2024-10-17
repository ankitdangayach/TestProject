package Java8;

import java.util.List;

public class FindAllPalindromeInListOfStrings {
    public static void main(String[] args) {
        List<String>  list = List.of("madam", "apple", "racecar", "civic");
        List<String> palindromes = findPalindromes(list);
        System.out.println(palindromes);

        String str = "A man, a plan, a canal, Panama";
        String revString = new StringBuilder(str.toLowerCase().replaceAll("[\\s,]", "")).reverse().toString();

        if(str.toLowerCase().replaceAll("[\\s,]", "").equals(revString)){
            System.out.println("String is pali");
        }else {
            System.out.println("String is not pali");
        }
    }

    private static List<String> findPalindromes(List<String> list) {
        return list.stream().filter(str -> new StringBuilder(str).reverse().toString().equals(str)).toList();
    }


    public static boolean checkPalindromeUsingRecursion(String inputString) {
        String str = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str + " modified string");
        if (str.length() == 0 || str.length() == 1)
            return true;

        // check first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;

        // check the remaining string
        return checkPalindromeUsingRecursion(str.substring(1, str.length() - 1));
    }

    public static boolean checkPalindromeUsingForLoop(String str) {
        int n = str.length();

        // Compare characters from beginning and end
        for (int i = 0; i < n / 2; i++)
            if (str.charAt(i) != str.charAt(n - i - 1))
                return false;

        return true;
    }

    public static boolean checkPalindromeUsingWhileLoop(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
