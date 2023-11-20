import java.util.Arrays;
import java.util.Collections;

public class AmazonCoding {
    public static void main(String[] args) {
        Integer arr[]
            = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;
        kLargest(arr, k);
        System.out.println();
        System.out.println(revers(1534236469));
    }

    static void kLargest(Integer[] arr, int k){
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int revers(int x){
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
            x/=10;
        }
        return rev;
    }

    static void mergedTwoSorted(int[] arr, int[] num){
        

    }
}
