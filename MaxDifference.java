import java.util.Arrays;

public class MaxDifference {
 public static void main(String[] args) {
    int[] number = {2,40,6,10};
	    Arrays.sort(number);
        int max = number[number.length - 1] - number[0];
        System.out.println(max);
 }   
 
}
