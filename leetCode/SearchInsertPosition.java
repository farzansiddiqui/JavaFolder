package leetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6};
        int k = 2; 
       // System.out.println(findIndex(arr, k));

       System.out.println(findIndexBinary(arr, k));
    }
    static int findIndex(int[] nums, int k){
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] == k) {
                    return i;
                }else if (nums[i] > k) {
                        return i;
                }

        }
        return n;
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
