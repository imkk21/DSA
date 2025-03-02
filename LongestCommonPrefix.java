import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        // Logic to find the longest common prefix
        if (strs.length == 0) {
            System.out.println("Output:\n");
            return;
        }

        String prefix = strs[0];
        for (int i = 0; i < prefix.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != prefix.charAt(i)) {
                    prefix = prefix.substring(0, i);
                    break;
                }
            }
        }

        // Output
        System.out.println("Output:\n" + prefix);

        scanner.close();
    }
}
