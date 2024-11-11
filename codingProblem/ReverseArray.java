import java.util.Arrays;



public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {51,54,3,45};
         reverse(arr);
         System.out.println(Arrays.toString(arr));
         
         System.out.println(reverseWords("Farzan Hassan Siddiqui"));
         
        
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;         
                end--;
        }
    }

    public static String reverseWords(String words){
        char[] characters = words.toCharArray();
        int length = words.length();
        reverseChar(characters, 0, length - 1);

        int start = 0;
        for(int i  = 0; i< length;i++){
            if (characters[i] == ' ' || i == length -  1) {
                if (i == length- 1) {
                    reverseChar(characters, start, i);
                }else {
                    reverseChar(characters, start, i - 1);
                }
                start=i+1;
                
            }
        }
        return new String(characters);

    }

    public static void reverseChar(char[] characters, int start, int end){
        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            start++;
            end--;
            
        }

    }
    
}
