package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SplitListIntoSublist {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sublistSize = 3;

        List<List<Integer>> sublists = splitIntoSubListsJava8(numbers, sublistSize);

        for (List<Integer> sublist : sublists) {
            System.out.println(sublist);
        }
    }

    public static <T> List<List<T>> splitList(List<T> list, int sublistSize) {
        List<List<T>> sublists = new ArrayList<>();
        for (int i = 0; i < list.size(); i = i + sublistSize) {
            sublists.add(new ArrayList<>(list.subList(i, Math.min(i + sublistSize, list.size()))));
        }
        return sublists;
    }


    public static List<List<Integer>> splitIntoSubLists(List<Integer> list, int sublistSize) {
        int baseSize = list.size() / sublistSize;
        int remainder = list.size() % sublistSize;

        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < sublistSize; i++) {
            int subListLength = baseSize + (i < remainder ? 1 : 0);
            var sublist = list.stream().skip(start).limit(subListLength).collect(Collectors.toList());
            result.add(sublist);
            start += subListLength;
        }
        return result;
    }

    public static List<List<Integer>> splitIntoSubListsJava8(List<Integer> list, int subListSize) {
        return IntStream.range(0, (list.size() + subListSize - 1) / subListSize)
                .mapToObj(i -> list.subList(i * subListSize, Math.min((i + 1) * subListSize, list.size())))
                .collect(Collectors.toList());
    }
}
