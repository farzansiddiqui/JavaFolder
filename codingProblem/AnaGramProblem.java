import java.util.Arrays;

public class AnaGramProblem {
    public static void main(String[] args) {
        String str1 = "Race";
    String str2 = "Care";
        System.out.println(anaGram(str1, str2));
        
    }
    static boolean anaGram(String str, String str2){
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        boolean result = false;

        if (str.length() == str2.length()) {
            char[] first = str.toCharArray();
            char[] second = str2.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);

             result = Arrays.equals(first, second);

            return result;
        }
        return result;
    }

}
