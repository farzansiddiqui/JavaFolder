package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SolutionDiagonal {
    public static void main(String[] args) {
       List<List<Integer>> matrix = new ArrayList<>();
       for (int i = 0; i < 3; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                    row.add(i * 3 + j);
                
            }
            matrix.add(row);
       }
       for (List<Integer> list : matrix) {
            for (int i = 0; i < list.size(); i++) {
                   for (int j = 0; j < list.size(); j++) {
                            if (i == j) {
                                System.out.println(list.get(i));
                            }
                   }
            }
            System.out.println();
       }
        
    }
    static int diagonalDifference(List<List<Integer>> arr){
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size(); j++) {
                    
                }
        }
        return result;
    }
}
