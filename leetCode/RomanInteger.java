package leetCode;

import java.util.*;

public class RomanInteger {

    private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
        System.out.println(integerToRoman2(1994));
      
    }
   
public static final String integerToRoman2(int number) {

	StringBuilder s = new StringBuilder();

	for (int i = 0; i < values.length; i++) {
		while (number >= values[i]) {
			number -= values[i];
			s.append(romanLiterals[i]);
		}
	}
	return s.toString();
}


    static int romantToInteger(String nums) {
        int res = 0;
        for (int i = 0; i < nums.length(); i++) {
                int s1 = returnCharValue(nums.charAt(i));
                if (i + 1 < nums.length()) {
                    int s2 = returnCharValue(nums.charAt(i + 1));
                    if (s1 >= s2) {
                        res+=s1;
                    }else {
                        res+=(s2-s1);
                        i++;
                    }
                }else {
                    res += s1;
                }
        }
        return res;

    }

    static int returnCharValue(char ch){
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                break;

        }
        return -1;
    }

    static String intToRoman(int nums){

        return "";
    }

     static int romanToInt(String nums){
        Map<Character,Integer> romanMap = new LinkedHashMap<>();
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);

        int result = 0;
        int n = nums.length();

        for (int i = 0; i < n; i++) {
             
            int value = romanMap.get(nums.charAt(i));
 
            if (i + 1 < n && romanMap.get(nums.charAt(i + 1)) > value) {
                result -= value;
            } else {
        
                result += value;
            }
        }
        return result;
    }
}

