import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

public class CountAndSay {

    public static String compressString(String input) {
       /* Scanner myObj = new Scanner(System.in);
        String string;
        System.out.println("Enter string");
        string = myObj.nextLine();*/
        String result = input.chars().mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().map(entry -> entry.getKey() + String.valueOf(entry.getValue()))
                .collect(Collectors.joining());
        return result;


/*        return IntStream.range(0, input.length())
                .mapToObj(i -> new int[]{i, 1})
                .collect(Collectors.groupingBy(
                        arr -> input.charAt(arr[0]),
                        Collectors.reducing((a, b) -> new int[]{a[0], a[1] + 1})
                ))
                .values().stream()
                .map(arr -> "" + input.charAt(arr[0] + arr.get().[1])
                .collect(Collectors.joining());*/




      /*  StringBuilder result = new StringBuilder();

        if(input.isEmpty()) {
           return result.toString();
        }
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(input.charAt(input.length() - 1)).append(count);

        return result.toString();*/

        /*return Arrays.stream(input.split("(?<=(.))(?!\\1)")).map(element -> String.valueOf(element.charAt(0)) + element.length()).collect(Collectors.joining());*/
    }
}
