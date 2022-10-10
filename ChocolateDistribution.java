//Find out Chocolate Distribution
import java.util.Arrays;
import java.util.Scanner;
public class ChocolateDistribution {
    public static int gFG(int[] arr, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }
        Arrays.sort(arr);
        if (n < m) {
            return -1;
        }
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff) {
                min_diff = diff;
            }
        }
        return min_diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(gFG(arr, n, m));
    }
}