package PatternProblem;

public class NumberPattern {
    public static void main(String[] args) {
                int num = 5;
                int n = 5;
            for (int i = 0; i < 5; i++) {
                num = n - i;
                    for (int k = 0; k<i; k++) {
                        System.out.print(" ");
                           
                    }
                    for (int j = 0; j < 5 - i; j++) {

                        System.out.print(num);
                        num--;
                    }

                    System.out.println("");
            }
    }
}
