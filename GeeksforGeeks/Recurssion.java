package GeeksforGeeks;

public class Recurssion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    
        printNumber(5);
       
    }
    static int fact(int n){
           
            if (n == 0 || n == 1) { 
                return 1;
            }else {
                System.out.println(n);
                return n * fact(n - 1); // untill base case is not reach.
            }
           
    }
    static void printNumber(int n){
        if (n == 0) {
           return;
        }

        System.out.println(n);
        printNumber(n - 1);//
       
    }

}
