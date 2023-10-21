package Hashing;
import java.util.*;

public class PhoneBookExample {
    public static void main(String[] args) {
        Map<String, Long> myPhoneMap = new HashMap<String,Long>(100,0.9f);
        myPhoneMap.put("Vikaram", 6306711605L);
        myPhoneMap.put("JD", 1258925585L);
        myPhoneMap.put("modu", 125975577L);
        
        

        Set<Map.Entry<String, Long>> mySet = myPhoneMap.entrySet();
        System.out.println("---------: Contacts in my Phone List :----------");


        for(Map.Entry<String,Long> phEntry:mySet){
            System.out.println("Name : "+phEntry.getKey()+" "+"Number: "+phEntry.getValue());
        }
        System.out.println("------------------------------------------------");

        System.out.println("No of contacts in myPhoneBook : " + myPhoneMap.size());
        System.out.println("Vikaram's Contact number : " + myPhoneMap.get("Vikaram"));
        System.out.println("Delete Mark's contact : " + myPhoneMap.remove("modu"));
        System.out.println("Vikaram's hashcode number : " + myPhoneMap.get("Vikaram").hashCode());

    }
    
}
