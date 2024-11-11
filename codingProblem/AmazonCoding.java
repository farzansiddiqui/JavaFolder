import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class AmazonCoding {
    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;
        kLargest(arr, k);
        System.out.println();
        System.out.println(revers(1534236469));

        int[] array = { 2, 7, 11, 15, 3, 6 };
        int target = 9;

        findAndPrintTargetNumbers(array, target);

        System.out.println(isAcronym("API", "Application Programming Interface"));

        int[] array1 = {1, 4, 7, 9};
        int[] array2 = {2, 3, 5, 8};

        int[] mergedArray = mergeSortedArrays(array1, array2);

        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));

        // Edge case: one array is empty

       wordFind("got", "I got your password. But forgot it.");

       
       

    }

    static void kLargest(Integer[] arr, int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int revers(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }

    static void mergedTwoSorted(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++]; // int[] array1 = {1, 4, 7, 9}; int[] array2 = {2, 3, 5, 8};
            }
        }

        // Copy the remaining elements of array1, if any
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy the remaining elements of array2, if any
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

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

    // UPI - User Program Interface 

    static boolean isAcronym(String acroNym, String acString) {
        boolean isVal = false;
        char[] aChar = acroNym.toCharArray();
        String[] spltStrings = acString.split(" ");
        if (aChar.length == spltStrings.length) {
            for (int i = 0; i < aChar.length; i++) {

                if (aChar[i] == spltStrings[i].charAt(0)) {
                    isVal = true;

                } else {
                    isVal = false;
                    break;
                }

            }

        }

        return isVal;

    }
    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge arrays while both have elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1, if any
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2, if any
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    // I got your password. But forgot it.
    
    static void wordFind(String word, String sentence){
        int increment = 0;
        String[] res = sentence.split(" ");
        System.out.println(Arrays.toString(res));
        for (int i = 0; i < res.length; i++) {
           
                if (res[i].toString().contains(word)){
                    ++increment;
                }
        }
        System.out.println(increment);

    }
}
