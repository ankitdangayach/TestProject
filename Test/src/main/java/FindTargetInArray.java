import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTargetInArray {

    public static void main(String[] args) {
        int[] integersArray = {2, 5, 7, 1, 9};
        int target = 7;

        boolean result = Arrays.stream(integersArray).filter(num-> num ==target).findFirst().isPresent();

        boolean resultWP = Arrays.stream(integersArray)
                .parallel() // Use parallel stream for better performance with large arrays
                .filter(num -> num == target)
                .findFirst().isPresent();

        int[] sortedArray = Arrays.stream(integersArray).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));

        int index = Arrays.binarySearch(sortedArray, target);

        if (index >= 0) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found");
        }
    }
}
