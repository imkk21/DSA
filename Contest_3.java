import java.util.Scanner;

public class Contest_3
{

    public static String encrypt(String input, int rotation)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);

            // Check if character is uppercase letter
            if (Character.isUpperCase(c))
            {
                char newChar = (char) (((c - 'A' + rotation) % 26) + 'A');
                result.append(newChar);
            } 
            // Check if character is lowercase letter
            else if (Character.isLowerCase(c))
            {
                char newChar = (char) (((c - 'a' + rotation) % 26) + 'a');
                result.append(newChar);
            } 
            else
            {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to encrypt: ");
        String input = scanner.nextLine();

        int rotation = 4;

        // output
        String encryptedOutput = encrypt(input, rotation);
        System.out.println("Encrypted Output: " + encryptedOutput);

        scanner.close();
    }
}
