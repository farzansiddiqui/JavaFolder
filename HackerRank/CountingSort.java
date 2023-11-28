package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 2, 3, 5, 9, 8, 6, 7, 6,1,6);
        List<Integer> result = countingSort(aList);
        System.out.print(result);
        String value = "Siddiqui";
        v

//         List <Integer> result = new ArrayList<>(100);
//     for (int i = 0; i < 100; i++) {
//         result.add(0);
//     }
//    for(int i : arr){
//        result.set(i, result.get(i)+1);
//    }
//     return result;

    }

    

    public static List<Integer> countingSort(List<Integer> arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < 100; index++) {
                    list.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
                list.set(arr.get(i), list.get(arr.get(i))+1);
        }

        return list;

    }


   
}

