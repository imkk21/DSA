/*
Step	        i	Array Before	Condition (in[i] < in[i-1]?)	Computation (q, in[i])	Array After
Start	        -	[2, 1, 3]	            -	                            -	            [2, 1, 3]
1st Iteration	1	[2, 1, 3]	            Yes (1 < 2)	                q=2, in[1]=2	    [2, 2, 3]
2nd Iteration	2	[2, 2, 3]	            No (3 > 2)	                No change	        [2, 2, 3] */





import java.util.Scanner;

public class NonDec {
    public static void func(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                int q = arr[i - 1] / arr[i];
                arr[i] = q * arr[i];
                if (arr[i] < arr[i - 1]) {
                    arr[i] += arr[i] / q;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            func(arr, n);
            
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
