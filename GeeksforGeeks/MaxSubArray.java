package GeeksforGeeks;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArraySum(arr));
        System.out.println("valuePrint");
        System.out.println(kadanesAlgorith(arr));

    }
    static int maxSubArraySum(int[] sum){
        int res = sum[0];
        for (int i = 0; i < sum.length; i++) {
                int currSum = 0;
                for (int j = i; j < sum.length; j++) {
                    currSum = currSum + sum[j];
                    
                    res = Math.max(res, currSum);
                }
        }
        return res;
    }
    static int kadanesAlgorith(int[] arr){
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
                maxEnding = Math.max(maxEnding + arr[i], arr[i]);
                res = Math.max(res, maxEnding);
        }
        return res;
    }
}
