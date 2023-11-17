package HackerRank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionPlusMinus {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, -4, -4, 0,-1);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        plusMinus(list);
        miniMaxSum(list1);

       

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

    public static void miniMaxSum(List<Integer> arr) {
        int total = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < arr.size(); index++) {
                total+=arr.get(index);
        }

        for (int i = 0; i < arr.size(); i++) {
                arrayList.add(total - arr.get(i));
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);

        System.out.println(arrayList.get(0)+" "+ arrayList.get(arr.size() - 1));

            
    // Write your code here

    }

}
