package Questions;

public class Checksum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(checksum(matrix));
        System.out.println(checksum1(matrix));
    }

    public static int checksum(int[][] matrix) {

        int checksum = 0;
        for (int row = 0; row < matrix.length; row++) {
            int max = matrix[row][0];
            int min = matrix[row][0];
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                }
                if (matrix[row][column] < min) {
                    min = matrix[row][column];
                }
            }
            int difference = max - min;
            checksum = checksum + difference;
        }
        return checksum;
    }

    public static int checksum1(int[][] matrix) {

        // Initialize checksum
        int checksum = 0;

        // Iterate through each row
        for (int[] row : matrix) {
            // Initialize min and max for the current row
            int min = row[0];
            int max = row[0];

            // Find min and max in the row
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            // Calculate difference and add to checksum
            int difference = max - min;
            checksum += difference;
        }
        return checksum;
    }

}
