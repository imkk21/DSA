/*
Iteration (i)	Read a[i]	    ans = Math.min(ans, a[i])
0	                3	        Math.min(2147483647, 3) → 3
1	                7	        Math.min(3, 7) → 3
2	                2	        Math.min(3, 2) → 2
3	                8	        Math.min(2, 8) → 2
4	                1	        Math.min(2, 1) → 1
 */


import java.util.Scanner;

public class NonEmptySubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                ans = Math.min(ans, a[i]);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
