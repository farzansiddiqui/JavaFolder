import java.util.HashMap;

public class StartPattern {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 17;
        System.out.println(hasPermissionTargetSum(array, target));
    }
    static boolean hasPermissionTargetSum(int[] arr, int target){
        if (arr == null || arr.length < 2) {
            return false;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (hashMap.containsKey(complement)) {
                    return true;
            }
            hashMap.put(arr[i], i);
        }

        return false;
    } 
}
