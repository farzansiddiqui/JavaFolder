
public class PrimeNumber {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 6, 7, 9, 11, 27, 23,3};
        System.out.println("Prime number...");
        findPrimNumber(arr);
        System.out.println();

        int number = 4;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                  isPrime = false;
                  break;
                }

        }
        if (isPrime) {
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is not prime number");
        }


    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;

            }
        }

        return true;
    }

    static void findPrimNumber(int[] number) {
        for (int num : number) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static void printPrime(int num) {
        for (int i = 0; i <= 15; i++) {
            int currentNumber = i;
            boolean isPrime = true;
            if (currentNumber <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(currentNumber); j++) {
                    if (currentNumber % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(currentNumber + " ");
            }

        }
    }

}
