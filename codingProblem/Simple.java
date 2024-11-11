public class Simple {
    public static void main(String[] args) {

        chekcBadInteger(5);
        

    }

    // multiples of 3
    // 3,6,13,23,33,43
    // 1,2,4,5,7,8,10,11,
    static void chekcBadInteger(int number) {
        int count = 1;
            for (int i = 1; i < number; i++) {
                    while (i < number) {
                        if (number % 3 == 0 || number % 10 == 3) {
                                count--;
                        }else {
                            count++;
                        }
                    }
                    count++;


            }
            System.out.println(count);
        
        
        }

    


}
