package PatternProblem;

public class StarPattern {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i < n; i++) {
            for (int k = 1; k < n - i; k++) {
                    System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(num+" ");
                ++num;
            }
            System.out.println();
        }
    }
}
