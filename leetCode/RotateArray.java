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
    }

    static void rotate(int[] nums, int k) {
        int[] storeValue = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            storeValue[i] = nums[i];
        }
        System.out.println(Arrays.toString(storeValue));
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
}
