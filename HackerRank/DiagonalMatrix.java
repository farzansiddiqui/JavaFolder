package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int n = 4;
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };

           
        printDiagnoalMatrix(a, n);
        printSecondaryDiagonal(a, n);

        List<List<Integer>> aList = List.of(List.of(11,2,4),
        List.of(4,5,6),List.of(10,8,-12));
        diagonalDifference(aList);

    
    }

    static void printDiagnoalMatrix(int mat[][], int n) {
        System.out.println("Principal Diagnoal");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // condition for principal diagonal

                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");

    }

    static void printSecondaryDiagonal(int mat[][], int n) {
        System.out.println("Secondary Diagnoal");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + ", ");
                }

            }
        }
        System.out.println("");

    }

    static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalDifference = 0;
        // Get the number of rows and columns in the matrix.
        int rows = arr.size();
        int principalDiagnoal  = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < rows; i++) {
                principalDiagnoal+=arr.get(i).get(i);
                secondaryDiagonal+=arr.get(i).get(rows - 1 - i);
              //  diagonalDifference+= arr.get(i).get(i) - arr.get(i).get(rows - 1 - i);
                
        }
        
        diagonalDifference = Math.abs(Math.abs(principalDiagnoal) - Math.abs(secondaryDiagonal));
      
        return diagonalDifference;
      
    }

}
