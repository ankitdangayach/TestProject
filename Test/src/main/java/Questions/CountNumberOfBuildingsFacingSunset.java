package Questions;

import java.util.Arrays;

public class CountNumberOfBuildingsFacingSunset {

    public static void main(String[] args) {
        /* int[] buildings = {1, 2, 3, 4, 5};*/
        int[] buildings = {7, 4, 8, 2, 9};
        System.out.println(countBuildings(buildings));

        System.out.println(countBuildingsFacingSun(buildings));
    }

    static int countBuildings(int[] buildings) {
        int count = 0;
        int maxHeight = 0;
        for (int building : buildings) {
            if (building > maxHeight) {
                count++;
                maxHeight = building;
            }
        }
        return count;
    }

    private static int maxHeight = 0;
    public static int countBuildingsFacingSun(int[] heights) {
        return (int) Arrays.stream(heights)
                .filter(height -> height > maxHeight)
                .mapToObj(height -> {
                    maxHeight = height;
                    return 1; // Count this building
                })
                .count();
    }




}

