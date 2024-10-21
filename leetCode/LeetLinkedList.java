package leetCode;

import java.util.*;
import java.util.HashMap;
import java.util.List;


class LeetLinkedList {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        int[] number = { 1, 3, 7, 5, 9, 6, 7, 3 };
        HashMap<Integer, Integer> hMap = new HashMap<>();

        List<Integer> listNumber = Arrays.asList(1, 3, 7, 5, 9, 6, 7, 3);
        List<Integer> duplicatesNumber = findDuplicaIntegers(listNumber);
        System.out.println(duplicatesNumber);

    }

    public static List<Integer> findDuplicaIntegers(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> dupIntegers = new ArrayList<>();

        for (Integer valuInteger : list) {
            if (map.get(valuInteger) > 1) {
                dupIntegers.add(valuInteger);
            }
        }
        return dupIntegers;
    }
}