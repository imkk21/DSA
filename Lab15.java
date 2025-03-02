import java.util.Scanner;

public class Lab15 {
    private static final int MOD = 1000000007;

    public static long legoWall(int n, int m) {
        // Edge case: if m is 0, there's one way to build a wall of width 0
        if (m == 0) return 1;

        long[] dp = new long[m + 1];

        // Base cases
        dp[0] = 1; // 1 way to build a wall of width 0 (no bricks)
        if (m >= 1) dp[1] = 1; // 1 way for width 1 (one 1x1 brick)
        if (m >= 2) dp[2] = 2; // 2 ways for width 2 (1x1 + 1x1 or 1x2)
        if (m >= 3) dp[3] = 4; // 4 ways for width 3 (1x1 + 1x1 + 1x1, 1x2 + 1x1, 1x1 + 1x2, 1x3)
        if (m >= 4) dp[4] = 8; // 8 ways for width 4

        // Fill the dp array for widths greater than 4
        for (int j = 5; j <= m; j++) {
            dp[j] = (dp[j - 1] + dp[j - 2] + dp[j - 3] + dp[j - 4]) % MOD;
        }

        // Total number of ways to build the wall of height n and width m
        return modPow(dp[m], n, MOD);
    }

    // Function to compute (base^exp) % mod using binary exponentiation
    private static long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod; // Ensure base is within mod
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the height and width
        System.out.print("Enter the height (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the width (m): ");
        int m = scanner.nextInt();
        
        // Calculate and print the result
        long result = legoWall(n, m);
        System.out.println(result);
        
        scanner.close();
    }
}
