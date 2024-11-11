import java.util.HashMap;

public class PracticeTest {
    public static void main(String[] args) {
        int[] array = { 2, 7, 11, 15, 3, 6 };
        int target = 9;

        findAndPrintTargetNumbers(array, target);
        int n = sum(10);
        System.out.println(n);
        
                   
        }
         // int[] array = {2, 7, 11, 15, 3, 6}; //
    private static void findAndPrintTargetNumbers(int[] nums, int target) {
        // Create a HashMap to store the elements and their occurrences
        HashMap<Integer, Integer> numMap = new HashMap<>();
        // 9
        for (int num : nums) {
            int complement = target - num;

            // Check if the complement is present in the HashMap
            if (numMap.containsKey(complement)) {
                // Print the pair of numbers
                System.out.println("Target numbers found: " + num + " and " + complement);
            }

            // Update the HashMap with the current number and its occurrences
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
    }

    static int fact(int n){
        if (n ==0 || n == 1) {
            return 1;
        }else {
            return n * fact(n - 1);
        }
    }
    static int sum(int number){
        if (number < 0 ) {
            return 0;
        }else {
            return number + sum(number - 1);
        }
    }
   
}
