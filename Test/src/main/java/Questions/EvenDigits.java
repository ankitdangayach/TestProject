package Questions;


//Count the number in an array that have even digits
public class EvenDigits {
    public static void main(String[] args) {
        int[] numbers = {18, 124, 9, 1764, 98, 1};
        System.out.println(findNumbers(numbers));

        System.out.println(digits(-123456789));

        System.out.println(digits2(-123456789));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function to check whether number contains even digit number or not
    static boolean even(int num) {
        int numberOfDigit = digits(num);
        return numberOfDigit % 2 == 0;
    }


    //count number of digit in a number
    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num *= -1; //num = num*-1
        }
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            num /= 10; //(num= num/10)
            count++;
        }
        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num *= -1; //num = num*-1
        }
       return (int) (Math.log10(num) +1);
    }

}
