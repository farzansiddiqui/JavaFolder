import java.util.ArrayList;

public class Common {
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");

        ArrayList<String> b= new ArrayList<>();
        b.add("a");
        b.add("h");
        b.add("k");
        b.add("d");

        ArrayList<String> c = new ArrayList<>();

        for(String elementA:a) {
            for(String elementB:b) {
                if (elementA.equals(elementB)) {
                    c.add(elementA);                    
                }
            }

        }
    
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
    
                if (a.get(i).equals(b.get(j))) {
                    c.add(a.get(i));
                }
        
            }
        }
        System.out.println("Common elements between ArrayList a and b: " + c);
    }
    
}
