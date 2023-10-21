
import java.util.HashMap;
public class FindNumber {

    public static void main(String[] args) {
          String val = "abadcabc";
          char[] aChar= val.toCharArray();
  
         
    // output = a3b2c2d1

    HashMap<Character, Integer> counts = new HashMap<>();

    for(char c : val.toCharArray()){
        if (counts.containsKey(c)) {
            counts.put(c, counts.get(c)+1);
        }else{
            counts.put(c, 1);
        }
    }
    
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("Hello String Buffer").append("value");
    System.out.println(stringBuffer.toString());


    StringBuilder output = new StringBuilder();
    
    for (Character c : counts.keySet()) {
        int count = counts.get(c);
        output.append(c).append(count);
       
    }

    System.out.println(output.toString());
    }
}




