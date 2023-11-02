import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] myNumbers = new int[rows][columns];

        for (int i = 0; i < myNumbers.length; i++) {
              for (int j = 0; j < myNumbers[i].length; j++) {
                    myNumbers[i][j] = sc.nextInt();
              }
        }
        int x = sc.nextInt();
        sc.close();
        
        for (int i = 0; i < myNumbers.length; i++) {
                for (int j = 0; j < myNumbers[i].length; j++) {
                        if (myNumbers[i][j] == x) {
                            System.out.println("("+i + ","+"" +j+")");
                        }
                }
               
        }

    }
}
