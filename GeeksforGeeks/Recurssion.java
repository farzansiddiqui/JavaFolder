package GeeksforGeeks;

public class Recurssion {
    public static void main(String[] args) {
       System.out.println(fact(1));
    
       // printNumber(5);

       // System.out.println(tailSum(0, 5));
        intTillN(5);
       
    }
    static int fact(int n){
           
            if (n == 0 || n == 1) { 
                return 1;
            }else {
                return n * fact(n - 1); // untill base case is not reach.
            }
           
    }
    static void printNumber(int n){
        if (n == 0) {
           return;
        }
        printNumber(n - 1);//
       
    }
    static int tailSum(int currentSum, int n){
            if (n <= 1) {
                return currentSum + 1;
            }
            return tailSum(currentSum + n, n - 1);
    }

    public static void intTillN(int n){
            if (n > 1) {
                intTillN(n - 1);
                System.out.print(n + " ");
            }else {
                System.out.print(n+" ");
            }
    }

}
