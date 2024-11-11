public class Practice {
    public static void main(String[] args)  {
        int n = 22;
        if (isPrime(n)) {
            System.out.println("prime");
        }else {
            System.out.println("Not Prime");
        }
     
        
    }

    static boolean isPrime(int number){
        return isPrimeNumber(number, 2);
    }
 
    static boolean isPrimeNumber(int number, int divisor){
        if (number <= 1) {
            return false;
        }
        if (divisor == number) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrimeNumber(number, divisor + 1);
    }
}
