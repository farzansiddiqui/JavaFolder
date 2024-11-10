package HackerRank;

import java.util.Arrays;

public class ZigZagArray {
        int x = 20;
    
    public static void main(String[] args) {
        
    
       char[] charVal = {'h','e','l','l','o'};
        reverseString(charVal);
       
    }
  
    
  

    public static void findZigZagSequence(int[] a, int n){
        // Step 1: Sort the array
        Arrays.sort(a);
        
        // Step 2: Find the middle element and swap with the last element
        int mid = n / 2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        // Step 3: Reverse the second half of the array after the middle
        int st = mid + 1;
        int ed = n - 2;
        
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }

        // Print the result in the required format
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
public static void reverseString(char[] s) {
        int n = s.length;
      for(int i = 0 ; i< n/2;i++){
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
      }
      return;
    }
    
}
