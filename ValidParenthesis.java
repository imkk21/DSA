import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
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
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid("(){}[]"));
        System.out.println(vp.isValid("(]"));
    }
}
