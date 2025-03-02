import java.util.Scanner;


public class Main {
  
  
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           int k=0;
        // Input: number and repetitions
        // System.out.print("Enter the number (n): ");
        String n = scanner.nextLine();
        // System.out.print("Enter the number of repetitions (k): ");
        k=scanner.nextInt();

        // Calculate and display the super digit
        int result = superDigit(n, k);
        System.out.println(result);

        scanner.close();
    }
    // Method to calculate the super digit
    public static int superDigit(String n, int k) {
        // Step 1: Calculate the sum of the digits of n
        long digitSum = 0;
        for (char digit : n.toCharArray()) {
            digitSum += Character.getNumericValue(digit);
        }

        // Step 2: Multiply by k
        long totalSum = digitSum * k;

        // Step 3: Find the super digit
        while (totalSum >= 10) { // While more than one digit
            totalSum = digitSumOf(totalSum);
        }

        return (int) totalSum;
    }

    // Helper method to calculate the sum of digits of a number
    private static long digitSumOf(long number) {
        long sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit
            number /= 10;       // Remove the last digit
        }
        return sum;
    }

   
}