package HackerRank;

import java.util.Scanner;

public class SolutionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
     
        int[] val = new int[a];
       
            for (int i = 0; i <a; i++) {
                val[i] = in.nextInt();
            }
               in.close();

        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }

    }
}
