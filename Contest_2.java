import java.util.Scanner;

public class Contest_2{

    public static String highestPalindrome(int maxChanges, String input) {
        char[] s = input.toCharArray();
        int n = s.length;
        boolean[] changed = new boolean[n];
        int mismatchCount = 0;

        for (int i = 0; i < n / 2; i++) {
            if (s[i] != s[n - i - 1]) {
                char maxChar = (char) Math.max(s[i], s[n - i - 1]);
                s[i] = maxChar;
                s[n - i - 1] = maxChar;
                changed[i] = true;
                mismatchCount++;
            }
        }

        if (mismatchCount > maxChanges) {
            return "-1";
        }

        int remainingChanges = maxChanges - mismatchCount;
        for (int i = 0; i < n / 2; i++) {
            if (s[i] != '9' && remainingChanges > 0) {
                if (changed[i] || remainingChanges >= 2) {
                    s[i] = '9';
                    s[n - i - 1] = '9';
                    remainingChanges -= (changed[i] ? 1 : 2);
                }
            }
        }

        if (n % 2 == 1 && remainingChanges > 0) {
            s[n / 2] = '9';
        }

        return new String(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxChanges = scanner.nextInt();
        String input = scanner.next();

        String result = highestPalindrome(maxChanges, input);
        System.out.println(result);
        scanner.close();
    }
}
    