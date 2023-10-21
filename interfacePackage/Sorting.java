import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {4,5,3,1,2};
            removeDuplicateNumber("Hello World");

        swapNumber();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i]; //4
                    array[i] = array[j]; // 3
                    array[j] = temp; // 4
                }
            }
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swapNumber() {
       int a = 101;
       int b = 202;
       
       int c = a + b;
       a = c-a;
       b = c-b;
       System.out.println("a: "+a+" "+"b: "+b);
    }
    public static void removeDuplicateNumber(String input){
       // Create a HashSet to store unique characters
        Set<Character> uniqueChars = new HashSet<>();
        // Create a HashSet to store duplicate characters
        Set<Character> duplicateChars = new HashSet<>();

        // Convert the input string to lowercase (optional)
        input = input.toLowerCase();

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // Ignore non-alphabetical characters
            if (Character.isLetter(c)) {
                if (!uniqueChars.add(c)) {
                    //!uniqueChars.add('l')

                    // If the character is already in uniqueChars, it's a duplicate
                    duplicateChars.add(c);
                }
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char c : duplicateChars) {
            System.out.println(c + " ");
        }
    }


    
    
}
