package HackerRank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SolutionPlusMinus {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, -4, -4, 0,-1);
       
        plusMinus(list);
    
        int[] arr = {1,2,3,4,5};
        int[] output =  minMaxSum(arr);
       System.out.println(Arrays.toString(output));

    }

    static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        List<String> resuList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (arr.get(i) > 0) {
                ++positive;
            } else if (arr.get(i) < 0) {
                ++negative;
            } else if (arr.get(i) == 0) {
                ++zero;
            }
        }
    
        double posDouble = Double.valueOf(positive);
        double negDouble = Double.valueOf(negative);
        double zeroDouble = Double.valueOf(zero);

        double length = Double.valueOf(size);

        double posResult = posDouble / length;
        double negResult = negDouble / length;
        double zeroResult = zeroDouble / length;

        DecimalFormat deFormat = new DecimalFormat("0.000000");
       
        resuList.add(deFormat.format(posResult));
        resuList.add(deFormat.format(negResult));
        resuList.add(deFormat.format(zeroResult));

            for (String lisString : resuList) {
                System.out.println(lisString);
            }
     
       
    }


    static int[] minMaxSum(int[] arr){
        int sum = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int num:arr){
            sum+=num;
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }
 
        int minSum = sum - maxValue;
        int maxSum = sum - minValue;
        System.out.println(minSum+" "+maxSum);
    
        return new int[]{minSum,maxSum};

    }

}
