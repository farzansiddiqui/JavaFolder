package leetCode;

import java.util.Arrays;

public class FirstMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingNumber(nums));
        
    }
    static int firstMissingNumber(int[] nums){
        Arrays.sort(nums);
        int target = 1;
        for (int n : nums) {
            if (n > 0 && n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }

        return target;
    }
}
