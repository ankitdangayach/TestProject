package Java8;

import java.util.stream.IntStream;

class IterateStreamWithIndices{

    public static void main(String[] args) {
        String[] array= {"H","E","L","L","O"};
        IntStream.range(0, array.length).
                mapToObj(index -> String.format("%d -> %s", index, array[index])).
                forEach(System.out::println);

        streamWithIndices(array);
    }

    public static void streamWithIndices(String[] array) {
        IntStream.range(0, array.length).mapToObj(index->index + " -> " + array[index])
                .forEach(System.out::println);
    }

 }