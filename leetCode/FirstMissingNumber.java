package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class FirstMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingNumber(nums));

        int[] numsValue = {2,5,7,13,10};
        printValue(numsValue);
        
    }

    static void printValue(int[] numbers){
        Arrays.sort(numbers);

        Arrays.sort(numbers);
       HashSet<Integer> set = new HashSet<>();

    for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
        set.add(i);
    }

    for (int i = 0; i < numbers.length; i++) {
        set.remove(numbers[i]);
    }

    for (int x : set) {
        System.out.print(x + " ");
    }
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
