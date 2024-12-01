package Hashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;



public class LinkedListProblem {
    public static void main(String[] args) {
        LinkedList<String> listNode = new LinkedList<>();

        Map<Integer, Integer> hMap = new HashMap<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        hMap.put(1, 2);
        hMap.put(1, 3);
        System.err.println(hMap.entrySet());
        
       
        listNode.add("farzan");
        listNode.add("hassan");
        listNode.add("siddiqui");

        
       

        System.out.println(listNode.get(1));

      
      
       
    }
   

}

