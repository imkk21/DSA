import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Job {
    char name;
    int deadline;
    int profit;

    Job(char name, int deadline, int profit) {
        this.name = name;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Contest_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        char[] jobNames = new char[n];
        int[] deadlines = new int[n];
        int[] profits = new int[n];
        
        for (int i = 0; i < n; i++) {
            jobNames[i] = scanner.next().charAt(0);
        }
        for (int i = 0; i < n; i++) {
            deadlines[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            profits[i] = scanner.nextInt();
        }
        
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(jobNames[i], deadlines[i], profits[i]);
        }
        
        Arrays.sort(jobs, Comparator.comparingInt((Job job) -> -job.profit));

        boolean[] slot = new boolean[n];
        char[] result = new char[n];
        int totalProfit = 0;
        
        for (Job job : jobs) {
            for (int j = Math.min(n, job.deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.name;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        
        for (char job : result) {
            if (job != 0) {
                System.out.print(job + " ");
            }
        }
        
        System.out.println();
        scanner.close();
    }
}
