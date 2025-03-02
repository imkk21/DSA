import java.util.Scanner;
import java.util.Stack;

public class BracketSeq {
    public static boolean isCorrectBracketSequence(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static int countCorrectShifts(String s) {
        int n = s.length();
        int count = 0;
        for (int shift = 0; shift < n; shift++) {
            String shiftedS = s.substring(shift) + s.substring(0, shift);
            if (isCorrectBracketSequence(shiftedS)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(countCorrectShifts(s));
        scanner.close();
    }
}