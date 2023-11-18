package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerLonely {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        int lonely = lonelyinteger(list);
        System.out.println(lonely);
    }

    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (Integer num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list.get(0);
    }
}
