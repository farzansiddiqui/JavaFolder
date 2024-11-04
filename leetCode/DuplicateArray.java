package leetCode;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
      //  System.out.println(containsDuplicate(nums));
     
      System.out.println(mult);
        System.out.println(fact(5));
        
    }
    static boolean containsDuplicate(int[] nums){
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int i : nums) {
            if (map.containsKey(i)) {
                return true;
            }
            map.put(i, 1);
       }
        return false;
    }

    static boolean containsDuplicateUsingHashSet(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (Integer numsNumber : nums) {
                if (seen.contains(numsNumber)) {
                    return true;
                }
                seen.add(numsNumber);
        }
        return false;
    }
    static int fact(int number){
      
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * fact(number - 1);
    }
}
