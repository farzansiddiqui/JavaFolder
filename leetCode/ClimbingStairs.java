package leetCode;


import java.util.LinkedHashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) throws Exception {
       // System.err.println(climbStairs(3));
     
    }
    static int climbStairs(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    static void printPascal(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j) +" ");
              
            }
            System.err.println();
        }
    }

    static int binomialCoeff(int n , int k){
        int res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; i++) {
                res*=(n -i);
                res/=(i + 1);
        }
        return res;
    }

    public int climbStairs12(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];        
    }
    
    static String countOccurrences(String s){
        Map<Character,Integer> hMap = new LinkedHashMap<>();
       char[] value = s.toCharArray();
       for (int i = 0; i < value.length; i++) {
            hMap.put(value[i], hMap.getOrDefault(value[i], 0)+1);
       }
       StringBuilder stringBuilder = new StringBuilder();
       for(Map.Entry<Character,Integer> entry : hMap.entrySet()){
        stringBuilder.append(entry.getKey()).append(entry.getValue());
       }
       return stringBuilder.toString();
    }

  

}
