package BackTracking;

public class StringBackTrc {
    public static void main(String[] args) {
        String str = "ABC";
        String newStr = str.substring(0, 0)+str.substring(0+ 1);
        System.out.println(newStr);
        printPermutation(str, "", 0);

    }

    static void printPermutation(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, perm + currentChar, index + 1);
        }

    }
}
