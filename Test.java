import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        // ArrayList<String> arrayList = new ArrayList<>();
        // arrayList.add("Animal");
        // arrayList.add("Dog");
        // arrayList.add("cat");
        // arrayList.add("Lion");
        // arrayList.add("Tiger");
        // arrayList.add("Elephant");
        // for(int i = 0; i< arrayList.size();i++){
        //     System.out.println(arrayList.get(i));
        // }

        int[] arr = {1,2,4,3};
        int prodcut = 1;
        for (int i = 0; i < arr.length; i++) {
                prodcut = prodcut * arr[i];
                
        }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                    int val = prodcut / arr[i];
                    arrayList.add(val);
            }

            System.out.println(arrayList);    
            String capString =  capString("Farzan001@GMAIL.com");
            System.out.println(capString);
            System.out.println(isPalindrom("abba"));
            int[] sNumber = {15,25,589,250,58};
            sortArrary(sNumber);
           
        
    }



    public static String capString(String input) {
        char[] charArray = input.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (Character.isUpperCase(c)) {
                        charArray[i] = Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    charArray[i] = Character.toUpperCase(c);
                }
        }
        return new String(charArray);
    }
    
    static void convertOpposite(StringBuffer str){
            int len = str.length();
            for (int i = 0; i < len; i++) {
                    Character c = str.charAt(i);
                    if (Character.isUpperCase(c)) {
                        str.replace(i, i+1, Character.toLowerCase(c)+" ");
                    }else {
                        str.replace(i, i +1, Character.toUpperCase(c)+" ");
                    }
            }
    }   

    public static int isPalindrom(String S){
        int val = 0;
        String reverse = "";
        String res = S;
        StringBuilder stringBuilder = new StringBuilder(S);
                stringBuilder.reverse();
            System.out.println(stringBuilder);
            if (stringBuilder.toString().equals(res)) {
                    val = 1;
                
            }

        // for (int i = 0; i < S.length(); i++) {
        //         reverse = S.charAt(i) + reverse;
        // }
        // if (reverse.equals(S)) {
        //         val = 1;
        // }
        return val;
    }
  
public static void sortArrary(int[] arr){
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
        
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
        }
       
    }
    printArray(arr);
   
     
}

public static void printArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
    }
    System.out.println("");
}
static void reverseWords(String words){
    char[] str = words.toCharArray();
    int length = words.length();
    reverseArray(str, 0, length - 1);
    int start = 0;
    for (int i = 0; i < length; i++) {
            if (str[i] == ' ' || i == length - 1) {
                if (i == length - 1) {
                    reverseArray(str, start, length);
                }else {
                    reverseArray(str, start, length - 1);
                }
                start=i+1;
            }
            
            
    }

}

    static void reverseArray(char[] arr, int start, int end){
        while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
        }

    }

}