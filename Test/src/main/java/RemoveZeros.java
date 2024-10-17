import java.util.Arrays;

public class RemoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 1, 0, 1, 0, 0};

        int index = 0;
        for (int number : numbers) {
            if (number == 0) {
                numbers[index++] = number;
            }
        }

        while (index < numbers.length) {
            numbers[index++] = 1;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
