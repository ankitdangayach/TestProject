package Java8;

import java.util.ArrayList;
import java.util.List;

public class SliceOfStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int startIndex = 3;
        int endIndex = 7;
        for (int i = 0; i <= 19; i++) {
            list.add(i);
        }

       list.stream().skip(startIndex).
               limit(endIndex-startIndex+1).forEach(System.out::println);

    }
}
