package leetCode;

public class FabNacciSeries {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibNac(i)+" ");
        }
        System.out.println("");
        System.err.println(fab(4));
     
    }
    static int fibNac(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return fibNac(n - 1) + fibNac(n  - 2);
    }

    static int fab(int n){
        int sum = 0;
        if (n == 0 || n  == 1) {
            sum+=n;
            return sum;
        }
        sum = fab( n - 1) + fab(n - 2);
        return sum;
    }
}
