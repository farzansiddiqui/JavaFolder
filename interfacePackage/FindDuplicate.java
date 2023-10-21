import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {8, 9, 4, 6, 2, 5, 6, 3, 9 };
        int dup = 0;

        Set<Integer> sIntegers = new HashSet<>();
        int sVal = 0;

        for (int i = 0; i < nums.length; i++) {
                if (sIntegers.contains(nums[i])) {
                    sVal = nums[i];
                }
               sIntegers.add(nums[i]);
        }
        
        System.out.println(sVal);
        for (int i = 0; i < nums.length; i++) {
              for (int j = 0; j < nums.length; j++) { 
                    if (nums[i] == nums[j]) {
                            dup = nums[i];
                    }
              }  
        }
        System.out.println(dup);
    }
}
