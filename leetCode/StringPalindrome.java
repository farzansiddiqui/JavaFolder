package leetCode;

public class StringPalindrome {
    public static void main(String[] args){
        String s1 = "hello world, hello java, hello everyone";
        String s2 = "hello";

        String str = "A man, a plan, a canal: Panama";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", " ").replaceAll(" ", "").toLowerCase());

        int frequency = foo(s1, s2);
        System.out.println("The frequency of '" + s2 + "' in '" + s1 + "' is: " + frequency);

       
    }
    
    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1; 
      
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) { // i = g , j = m 
                return false;
            }
            i++; // 
            j--; //
        }
        return true;
    }

    static String longestPalindromeNaive(String s){
        int n = s.length();
        String longestPalindrome = "";
           // Generate all possible substrings and check if they are palindromes  

           for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    String substring = s.substring(i, j + 1);  
                    if (isPalindrome(substring) && substring.length() > longestPalindrome.length()){  
                          longestPalindrome = substring;  
                      }  
                }
           }
        return longestPalindrome;
    }

  
    static void stringReverse(String rev){
        String res = "";
        for (int i = 0; i < rev.length(); i++) {
                res = rev.charAt(i) + res;
        }
        System.out.println(res);
    }

    public static int foo(String s1, String s2) {
        int count = 0;
        int index = 0;
        System.out.println(s1.indexOf(s2,5));

        // Loop through s1 and find occurrences of s2
        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index += s2.length(); // Move index forward to avoid counting the same occurrence
        }

        return count;
    }

   static boolean isPalindromeValue(String s){

        return true;
    }

}
