package Search.LinearSearch;

public class SearchMaxIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {13, 12, 63},
                {42, 15, 64, 6},
                {17, 8, 34, 67},
                {49, 78}
        };
        System.out.println(searchMax(arr));
    }

    static int searchMax(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }


}
