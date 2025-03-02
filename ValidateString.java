import java.util.Scanner;
import java.util.Stack;

class ValidateString{
    
    public static int isValid(String s){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        int maxLength = 0;

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    maxLength = Math.max(maxLength, i - stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();

    }
}
