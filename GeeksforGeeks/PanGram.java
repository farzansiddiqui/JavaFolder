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
            
            for (int i = 0; i < str.length(); i++) {

                if (isLetter(str.charAt(i))) {
                
                    int letter = str.charAt(i) - 'a';
                
                    present[letter] = true;
                }

            }
 
            for (int i = 0; i < size; i++) {
            if (!present[i])
            return false;
    }
    return true;
            }
    
        }

