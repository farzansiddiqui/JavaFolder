import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxDifference {
 public static void main(String[] args) {
    int[] number = {2,40,6,10,11};
	    Arrays.sort(number);
       int min = number[1]- number[0];

       for (int i = 2; i < number.length; i++) {
               min = Math.min(min, number[i] - number[i - 1]);
       }
       System.out.println(min);
      
        int max = number[number.length - 1] - number[0];
        System.out.println(max);

        

 }   
 
}
