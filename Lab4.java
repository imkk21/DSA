import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 4-digit integer: ");
        String input = scanner.nextLine();
        scanner.close();
        
        int number;
        try {
            // Convert to an integer and check if the input is a positive 4-digit integer
            number = Integer.parseInt(input);
            
            if (number < 1000 || number > 9999) {
                System.out.println("Enter a 4-digit integer");
                return;
            } else if (number <= 0) {
                System.out.println("Enter a positive 4-digit integer");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter only integer value");
            return;
        }
        
        // Encryption process
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        // Add 5 to each digit and get the remainder when divided by 10
        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 5) % 10;
        }
        
        // Swap the first digit with the third, and the second digit with the fourth
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;
        
        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;
        
        // Combine the digits back to form the encrypted number
        int encryptedNumber = 0;
        for (int i = 0; i < 4; i++) {
            encryptedNumber = encryptedNumber * 10 + digits[i];
        }
        
        // Output the result
        System.out.println("Output: " + encryptedNumber);
    }
}
