public class CountDigit {
    public static void main(String[] args) {
        /* Java program for counting the digits present in a number.*/
        int N = 5647;
        System.out.println("The total digits in number " + N + " are: " + cntDig(N));
    }

    public static int cntDig(int n) {
// The number 0 has the 1 dig.
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
        }
        int cnt = 0;
        while (n != 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;

    }
}
