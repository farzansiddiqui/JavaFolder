package leetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] value = {99};
        System.out.println(Arrays.toString(plusOne(value)));
        System.out.println(Arrays.toString(plusOneAdd(value)));

        System.out.println((int)Math.sqrt(9)+"");
    }
   static public int[] plusOne(int[] digits) {
        int[] value = new int[digits.length];
        value[value.length - 1] = digits[digits.length - 1] + 1;

        for(int i = 0; i <= digits.length - 2;i++){
            value[i] = digits[i];
        }
        return value;
    }

    static int[] plusOneAdd(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
