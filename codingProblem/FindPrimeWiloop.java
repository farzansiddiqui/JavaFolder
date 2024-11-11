public class FindPrimeWiloop {
    public static void main(String[] args) {
        printPrimeIsRange(2, 100);
        int n = 5;
        if (isPrime(n)) {
            System.out.println("prime");
        }else {
            System.out.println("Not Prime");
        }
    }

    public static void printPrimeIsRange(int start, int end) {
        if (start > end) {
            return;
        }
        if (isPrime(start)) {
            System.out.print(start+" ");
        }
        printPrimeIsRange(start+1, end);

    }

    public static boolean isPrime(int num) {
            return isPrimeHelper(num, 2);
    }

    private static boolean isPrimeHelper(int num, int divisor) {
        if (num <= 1) {
            return false;
        }
        if (divisor == num) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return isPrimeHelper(num, divisor + 1);
    }
}
