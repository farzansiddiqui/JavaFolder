package leetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arra = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        k%=arra.length;
        reverse(arra, 0, arra.length - 1);
        reverse(arra, 0, k - 1);
        reverse(arra, k, arra.length - 1);
        int[] nums = {2,3,5,1,4};
        
        findZigZagSequence(nums,5);
    }

    static void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = n/2;
    
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 2;
        
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

}
