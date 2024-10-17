package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        /*list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println(list);
        list.set(0, 99);
        System.out.println(list);*/

        Scanner in = new Scanner(System.in);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
        System.out.println(list);
    }
}
