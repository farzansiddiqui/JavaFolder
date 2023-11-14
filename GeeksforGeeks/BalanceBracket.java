package GeeksforGeeks;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceBracket {
    public static void main(String[] args) {
        String expr = "([{}])";
        if (areBracketsAreBalanced(expr)) {
            System.out.println("Balanced ");
        }else {
            System.out.println("Not Balanced ");
        }
        
    }
    public static boolean areBracketsAreBalanced(String s){
                Deque<Character> stack = new ArrayDeque<>();
                for (int i = 0; i < s.length(); i++) {
                        char x = s.charAt(i);
                        if (x == '(' || x == '[' || x == '{') {
                            stack.push(x);
                            continue;
                        }
                         // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.l
                        if (stack.isEmpty()) {
                            return false;
                        }
                        char check;
                        switch (x) {
                            case ')':
                                check = stack.pop();
                                if (check == '{' || check == '[') {
                                    return false;
                    
                                }
                                break;

                                case '}':
                                check = stack.pop();
                                if (check == '(' || check == '[')
                                    return false;
                                break;
                                case ']':
                                check = stack.pop();
                                if (check == '(' || check == '{')
                                    return false;
                                break;
                        
                            default:
                            System.out.println("Expression is not contain");
                                break;
                        }
                }
            return (stack.isEmpty());
    }
}
