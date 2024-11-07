package leetCode;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
       System.out.println(reverseInt(1234));
        
    }
    static boolean isValidParenthesis(String params){
        Stack<Character> cStack = new Stack<>();
        for (int i = 0; i < params.length(); i++) {
            //check if bracket is in opening bracket
            if (params.charAt(i) == '(' || params.charAt(i) == '{' || params.charAt(i) == '[') {
                cStack.push(params.charAt(i));
            }else {
                // If it's a closing bracket, check if the stack is non-empty
                // and if the top of the stack is a matching opening bracket
                if (!cStack.isEmpty() && ((cStack.peek() == '(' && params.charAt(i) == ')')
                || (cStack.peek() == '{' && params.charAt(i) == '}')
                || (cStack.peek() == '[' && params.charAt(i) == ']'))) {
                    cStack.pop();
                    
                }else {
                    return false;
                }
            }
        }
        return cStack.isEmpty();
    }
    public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }
    }

    static int reverseInt(int nums){
        int res = 0;
        while (nums != 0) {
                int reminder = nums%10;
                res = res * 10 + reminder;
                nums/=10;
        }
        return res;
    }
}
