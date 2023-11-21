package GeeksforGeeks;

public class PanGram {
    static int size = 26;
    public static void main(String[] args) {
        String str = "bcadefghijklmnopqrstuvwxyZ";
        int len = str.length();
 
        // Function Call
        if (allLetter(str, len))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
        
    
    static boolean isLetter(char ch){
        if (!Character.isLetter(ch)) {
            return false;
        }
        return true;
    }


    static boolean allLetter(String str, int len){
            str = str.toLowerCase();
            boolean[] present = new boolean[size];
            // Traverse for each character
        // of the string
            for (int i = 0; i < str.length(); i++) {

                if (isLetter(str.charAt(i))) {
                    // Mark current letter as present
                    int letter = str.charAt(i) - 'a';
                
                    present[letter] = true;
                }

            }
 // Traverse for every letter
        // from a to z
            for (int i = 0; i < size; i++) {
                  // If the current character
            // is not present in string
            // then return false,
            // otherwise return true
            if (!present[i])
            return false;
    }
    return true;
            }
    
        }

