public class SumOfDigits {
    public static void main(String[] args) {
        int num = 888;
        int sum =0;
        while(num>0) {
            int rem = num % 10;

            sum = sum +rem;

            num = num/10;
        }

        System.out.println(sum);
    }


    /*Find sum of all digits of a number in Java 8?*/
       /* int i = 88888888;
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sumOfDigits);*/
}
