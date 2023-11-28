package HackerRank;

import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        String A = "java";
        String palindrom = A;
        String rev = "";
        for(int i = 0; i < A.length();i++){
            rev =  A.charAt(i)+rev;
        }
        if(palindrom.equals(rev)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        anangram("Hello", "hello");
       
    }
    public static void anangram(String str, String str1){
       str =  str.toLowerCase();
        str1 = str1.toLowerCase();
        
        char[] a = str.toCharArray();
        char[] b = str1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
        boolean anangram = Arrays.equals(a, b);
        if (anangram) {
            System.out.println("Anangrams");
        }else {
            System.out.println("Not Anangrams");
        }
    }
}
