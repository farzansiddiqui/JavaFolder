package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 2, 3, 5, 9, 8, 6, 7, 6,1,6);
        List<Integer> result = countingSort(aList);
        System.out.print(result);

        System.out.println(palindrom("Radar"));


    }

    public static List<Integer> countingSort(List<Integer> arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hMap = new HashMap<>();

    
        for (Integer integer : arr) {
                hMap.put(integer, hMap.getOrDefault(integer, 0)+1);
            }
            
            for(Map.Entry<Integer, Integer> entry : hMap.entrySet()){
                list.add(entry.getValue() - 1);
            }
            Collections.sort(list);

        return list;

    }

    static boolean palindrom(String value) {
        String rev = "";
        
        for (int i = value.length() - 1; i>=0; i--) {
                rev+=value.charAt(i);
        }

        if (value.toLowerCase().equals(rev.toLowerCase())) {
                return true;
        }

        return false;


    }


   
}
