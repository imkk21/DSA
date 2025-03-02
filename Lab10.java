import java.util.Scanner;

public class Lab10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[size + 1];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int add = sc.nextInt();

            arr[start - 1] += add;
            if (end < size) {
                arr[end] -= add;
            }
        }

        int max = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < size; i++) {
            current += arr[i];
            max = Math.max(max, current);
        }

        System.out.println(max);

        sc.close();
    }
}
