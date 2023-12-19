import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JavaDup {
    public static void main(String[] args) {
        int[] number = {1, 5 , 5, 7, 8 , 7, 45 , 78, 78,55};
        ArrayList<Integer> aList = new ArrayList<>();
        
        HashMap<Integer, Integer>hMap = new HashMap<>();

        for(int num:number){
            hMap.put(num, hMap.getOrDefault(num, 0)+1);
        
        }

        for (Map.Entry<Integer,Integer>enteEntry : hMap.entrySet()) {
                if (enteEntry.getValue() > 1) {
                    System.out.print(enteEntry.getKey()+" ");
                }
        }
    
       // findDuplicateNumber(number);
        
        // for (int i = 0; i < number.length; i++) {
        //     aList.add(number[i]);   
        // }
        // for (int integer : number) {
        //     if (!aList.contains(integer)) {
        //        aList.add(integer);
        //     }
            
        // }
    }
    
    public static void findDuplicateNumber(int[] number){
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> tempArrayList = new ArrayList<>();

        for (int i : number) {
            if (!tempArrayList.contains(i)) {
                tempArrayList.add(i);
            }else if (!arrayList.contains(i)) {
                arrayList.add(i);
            }

           
        }
        printArray(arrayList);
      
    }

    public static void printArray(ArrayList<Integer> display){
        for (Integer integer : display) {
                 System.out.print(integer);
                System.out.print(" "); 
        }
        System.out.print(" ");
 }
}
