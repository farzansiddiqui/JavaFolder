
import java.util.*;
public class ZigZagArray {
    public static void main(String[] args){
      // int[] arr =  { 4, 3, 7, 8, 6, 2, 1 };
      // findZigZagSequence(arr);
      Scanner kb = new Scanner(System.in);
      int test_cases = kb.nextInt();
      for(int cs = 0; cs <= test_cases - 2; cs++){
          int n = kb.nextInt();
           int a[] = new int[n];
          for(int i = 0; i < n; i++){
              a[i] = kb.nextInt();
          }
         //
        
         System.out.println(Arrays.toString(a));
        
      }

      kb.close();
       
    }

    public static void findZigZagSequence(int [] a,int n){
        Arrays.sort(a);
        int mid = (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 1;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) 
            System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
}



