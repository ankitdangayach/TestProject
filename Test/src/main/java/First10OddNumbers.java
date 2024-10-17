public class First10OddNumbers {

    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 10) {
            System.out.println(number);
            number = number + 2;
            count++;
        }
    }


    /*Print first 10 even numbers*/
    /* IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);*/
}
