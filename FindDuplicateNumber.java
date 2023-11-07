import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateNumber {
    public static void main(String[] args) {

        //int[] numbers = {1, 2, 3, 4, 3, 5, 6, 6, 7, 8, 9, 9};
        int[] numbers = {1, 2, 3, 4, 5};
    
        HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < numbers.length; i++) {      
            hashMap.put(numbers[i], hashMap.getOrDefault(numbers[i], 0)+1);
            }
        
            for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
                   if (entry.getValue() > 1) {
                    System.out.println(entry.getKey());
                   }
                   
                    
                   }
                   
        }
   
}
