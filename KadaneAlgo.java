import java.util.Scanner;

public class KadaneAlgo {

    public static int maxSum(int n, int[] arr) {
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = maxSum(n, arr);
        System.out.println(result);
        scanner.close();
    }
}
