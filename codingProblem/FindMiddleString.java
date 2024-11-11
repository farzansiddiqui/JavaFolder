import java.util.Scanner;

public class FindMiddleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String val = sc.next();
        int len = val.length();
        int middleIndex = len / 2;
        StringBuilder sBuilder = new StringBuilder();
        sc.close();
        

                if (len % 2 == 0) {
                    
                    sBuilder.append(val.charAt(middleIndex - 1)).append(val.charAt(middleIndex));
                
                    System.out.println(sBuilder.toString());
                    
                }else {
                    sBuilder.append(val.charAt(middleIndex)).append(val.charAt(middleIndex+1));
                    System.out.println(sBuilder.toString());
                }
              
    
    }
}
