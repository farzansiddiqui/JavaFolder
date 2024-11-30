package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
       
       System.out.println(longestCommonPrefix(input));

       

       System.err.println(findLongestString("I ldfdfove India"));

       String s = "Iffddfdd lovffgfe IndiaIndiaInda";
       String[] strValue = s.split(" ");

       
       String resulString = "";

       for (int index = 0; index < strValue.length; index++) {
                    if (strValue[index].length() > resulString.length()) {
                            resulString = strValue[index];
                    }
       }
       System.out.println(resulString);
     

    }
    static String findPrefix(String[] arrStrings) {
            String prefix = arrStrings[0];
            if (arrStrings == null || arrStrings.length == 0) {
                return "";
            }
            for (int i = 1; i < arrStrings.length; i++) {
                    while (arrStrings[i].indexOf(prefix) != 0) {
                        prefix = prefix.substring(0, prefix.length() - 1); // 
                        if (prefix.isEmpty()) {
                            return "";
                        }
                    }
            }
        return prefix;

    }
    public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    static String findLongestString(String str){
        String res = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
       
        return res;
    }


    
}
