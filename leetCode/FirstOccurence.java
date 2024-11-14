package leetCode;

public class FirstOccurence {
    public static void main(String[] args) {
        String hayStack = "hello";
        
        String needle = "ll";
        System.out.println(strStr(hayStack, needle));
        
    }
    static int strStr(String hayStack, String needle){
        int m = hayStack.length(), n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            if (hayStack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
