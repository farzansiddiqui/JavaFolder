import java.util.Arrays;

public class Abstract {
    public static void main(String[] args) {
        InnerAbstract abstract1 = new InnerAbstract_1();
        abstract1.fun();
        abstract1.learn();
        String a = "Race";
        String b = "Care";
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] ra = a.toCharArray();
        char[] ba = b.toCharArray();
     
        Arrays.sort(ra);
        Arrays.sort(ba);

        boolean anagram = Arrays.equals(ra, ba);
        if (anagram) {
            System.out.println("is value is anagram");
        }
    }

    
}
abstract class InnerAbstract {
    abstract void fun();
    

    void learn(){
        System.out.println("Learn abstract method");
    }
    
}
/**
 * InnerAbstract_1
 */
 class InnerAbstract_1 extends InnerAbstract{

    
    @Override
    void fun() {
        System.out.println("Abstract class");
        
    }
}
