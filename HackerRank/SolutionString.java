package HackerRank;

import java.util.Scanner;

public class SolutionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase().trim();
        String B = sc.next().toLowerCase().trim();
        
        System.out.println((A+B).length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(A.replace(A.charAt(0), A.toUpperCase().charAt(0))+" "+B.replace(B.charAt(0),
         B.toUpperCase().charAt(0)));
    }
}
