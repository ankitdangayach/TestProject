public class FindTempCloserToZero {
    public static void main(String[] args) {
        int[] temps = {3, -2, 5, -1, 4, -3, 2, 1};

        if (temps == null || temps.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int closest = temps[0];

        for (int temp : temps) {
            if (Math.abs(temp) < Math.abs(closest) || (Math.abs(temp) == Math.abs(closest) && temp > closest)) {
                closest = temp;
            }
        }
        System.out.println(closest);
    }
}
