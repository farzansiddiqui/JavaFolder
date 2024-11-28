package leetCode;

import java.util.Arrays;

public class CountPrime {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    static int countPrimers(int n){
        int count  = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int number){
        if (number <=1) {
            return false;
        }
     
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
            
        }

        return true;
    }

    public static int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;

        boolean[] isPrime = new boolean[n+1];

        

        for (int i = 2; i <= Math.sqrt(n); i++){
        
            if (!isPrime[i]){
                for (int j = i*i; j <= n; j+=i){
                    isPrime[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++){
            if (!isPrime[i]){
                count++;
            }
               
        }

        return count;
    }
}
