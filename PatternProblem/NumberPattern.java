package PatternProblem;

public class NumberPattern {
    public static void main(String[] args) {

                for (int i = 5; i > 0; i--) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 5-i; j++) {
                            System.out.print(i);   
                        }
                        System.out.println("");
                }

            //     int num = 5;
            //     int n = 5;
            // for (int i = 0; i < n; i++) {
            //     num = n - i;
            //         for (int k = 0; k<i; k++) {
            //             System.out.print(" ");
                           
            //         }
            //         for (int j = 0; j < n - i; j++) {
            //             System.out.print(num);
            //             num--;
            //         }

            //         System.out.println("");
            // }

    }
}
