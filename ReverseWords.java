class ReverseWords {
    public static void main(String[] args) {
        String s[] = "you shall not pass".split(" "); 
        String ans = ""; 
        String reString = reverseWords("Farzan Hassan Siddiqui");
        System.out.println(reString);
       
        // for (int i = s.length - 1; i >= 0; i--) { 
        //   ans += s[i] + " "; 
        // } 
        // System.out.println("Reversed String: " + ans); 
    }

    public static String reverseWords(String input) {
      char[] characters = input.toCharArray();
      int length = input.length();
      reverseCharacters(characters, 0, length - 1); // Reverse the entire string

      int start = 0;
      for (int end = 0; end < length; end++) {
          if (characters[end] == ' ' || end == length - 1) {
              if (end == length - 1) {
                  reverseCharacters(characters, start, end); // Reverse the last word
              } else {
                  reverseCharacters(characters, start, end - 1); // Reverse a word
              }
              start = end + 1; // Move to the next word
          }
      }

      return new String(characters);
  }

  private static void reverseCharacters(char[] characters, int start, int end) {
      while (start < end) {
          char temp = characters[start];
          characters[start] = characters[end];
          characters[end] = temp;
          start++;
          end--;
      }
  }
  
}