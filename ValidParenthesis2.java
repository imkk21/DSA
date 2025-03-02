import java.util.*;

class ValidParenthesis {
    public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();
    }
}
