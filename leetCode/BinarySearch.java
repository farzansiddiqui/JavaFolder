package leetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int k = 3;
        System.out.println(findIndex(arr, k));
        //System.out.println(5/2);

        // Time complexity O(logn)
        
    }
    static int findIndex(int[] nums, int k){
        int low = 0, high = nums.length - 1;

        while (low <= high) {
                int middle  = (high + low) / 2;

                // check if target value is present

                if (nums[middle] == k) {
                    return middle;
                }

                // if taget value is greater than ignore left half
                if (nums[middle] < k) {
                    low = middle + 1;
                }else {
                    high = middle - 1;
                }
        }
        return -1;
    }
    static int findIndexBinary(int[] arr, int target){
        int right = arr.length - 1, left = 0;
        while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == target) {
                    return mid;
                }else if (arr[mid] > target) {
                    right =  mid - 1;
                }else {
                    left =  mid + 1;
                }
        }
        return left;
    }
}
