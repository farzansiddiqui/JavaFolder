import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String val = "Farzan Hassan Siddiqui";
        String[] splStrings = val.split(" ");
        
        String rev = "";
        String reveString = "";
        String vlaueString = "HelloWorld";

        for (int i = 0; i < vlaueString.length(); i++) {
                reveString = vlaueString.charAt(i)+reveString;
        }
        System.out.println(reveString);

 

        for (int i = splStrings.length-1; i >= 0; i--) {
            rev+= splStrings[i]+" "; // siddiqui hassan Farzan
        }
        System.out.println(rev);
    }
}
