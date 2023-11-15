package GeeksforGeeks;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        
        
        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
       stackPeek(stack);
        stackSearch(stack, 1);
        stackSearch(stack, 6);
        
    }
     // pushing the element on the top of the stack..
    static void stackPush(Stack<Integer> stack){
        for (int i = 0; i < 5; i++) {
                stack.push(i);
        }
    }

    // Popping element on the top of the stack...
    static void stackPop(Stack<Integer> stack){
        System.out.println("Pop Operations...");
        for (int i = 0; i < 5; i++) {
                Integer aInteger = stack.pop();
               System.out.println(aInteger);
        }
    }
    // Displaying element on the top of the stack..
     static void stackPeek(Stack<Integer> stack){
        Integer element = stack.peek();
        System.out.println("Element on stack top: " + element);
     }
     //Seaching element in the stack..
     static void stackSearch(Stack<Integer> stack, int element){
                Integer pos = stack.search(element);
                if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
     }


}
