public class RecursionPractice {
    public static void main(String[] args) {
        printNumber(1);
        
    }
    int fact(int number){
        if (number <= 1) {
            return 1;
        }else {
            return number * fact(number- 1);
        }
    }
    static int fibnacci(int number){
            if (number <= 1) {
                return number;
            }else {
                return fibnacci(number - 1) + fibnacci(number - 2);
            }
    }
   
    static void printFun(int test){
        if (test < 1) {
            return;
        }else {
            System.out.printf("%d",test);
            printFun(test - 1);
            System.out.printf("%d",test);
            return;

        }
    
    }

    static void printNumber(int number){
            if (number == 6) {
                return;
            }
            System.out.print(number+" ");
            printNumber(number + 1);
    }


}
