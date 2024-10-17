package Java8;

import java.util.Arrays;
import java.util.List;

public class CountTheTotalNumberOfItemsInAList {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(countTheTotalNumberOfItemsInAList(myList));
    }

    public static long countTheTotalNumberOfItemsInAList(List<Integer> myList) {
        return myList.size();
    }
}
