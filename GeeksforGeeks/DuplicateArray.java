package GeeksforGeeks;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 4, 5, 5};
            new InnerDuplicateArray();
            ArrayList<Integer> duplicatesList = InnerDuplicateArray.duplicates(arr, arr.length);
        }
        
}

/**
 * InnerDuplicateArray
 */
 class InnerDuplicateArray {
    public static ArrayList<Integer> duplicates(int[] arr, int n){
        ArrayList<Integer> results = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                results.add(num);
            }else {
                seen.add(num);
            }
        }
        if (results.isEmpty()) {
            results.add(-1);
        }
        return results;
    }
    
}
