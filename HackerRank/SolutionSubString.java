package HackerRank;

import java.util.Scanner;

public class SolutionSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String subStrings = s.substring(start, end);
        System.out.println(subStrings);
    }
}
