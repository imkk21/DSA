import java.util.Scanner;

public class Contest_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = scanner.nextInt(); // number of days secret gets spread
        int delay = scanner.nextInt(); // delay days
        int forget = scanner.nextInt(); // forgetting days
        
        // Array to track the number of people who discover the secret each day
        long[] dp = new long[n + 1];
        dp[0] = 1; // One person knows the secret on day 0
        
        long totalPeople = 0;
        
        for (int day = 0; day < n; day++) {
            if (day >= delay) {
                // New people discovering the secret today
                dp[day] += dp[day - delay];
            }
            if (day >= forget) {
                // Subtract those who forget the secret today
                dp[day] -= dp[day - forget];
            }
            
            // Update the total count of people who know the secret
            totalPeople += dp[day];
        }
        
        // Output the total number of people who know the secret at the end of day n
        System.out.println(totalPeople);
        scanner.close();
    }
}
