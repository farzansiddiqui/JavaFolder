package leetCode;

import java.util.ArrayList;

public class BuySellStock {
    public static void main(String[] args) {
        int[] nums = {3,5,1,7,4,9,3};
        System.out.println(maxProfit(nums));
    }
    static int maxProfit(int[] prices){

        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
                if (buyPrice > prices[i]) {
                    buyPrice = prices[i];
                }
                profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
    }
    static ArrayList<Integer> duplicateValue(int[] value){
        ArrayList<Integer> arrayList = new ArrayList<>();
        //ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {    
            if (arrayList.contains(value[i])) {
                arrayList.add(value[i]);
            }
            arrayList.add(value[i]);
        }
        return arrayList;
    }
}
