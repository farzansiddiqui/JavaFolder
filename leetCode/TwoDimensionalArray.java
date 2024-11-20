package leetCode;

public class TwoDimensionalArray {
public static void main(String[] args) {
    int size = 4;

    int A[][] = { { 1, 1, 1, 1 },
                  { 2, 2, 2, 2 },
                  { 3, 3, 3, 3 },
                  { 4, 4, 4, 4 } };

    int B[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };

                      int C[][] = add(A, B, size);
                      printValue(C, size, size);
    }

    static int[][] add(int[][] nums, int[][] B, int size){
        int[][] addMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    addMatrix[i][j] = nums[i][j] + B[i][j];
                }
        }
        return addMatrix;
    }

    static void printValue(int[][] arr, int rowSize, int columnSize){ 
      for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                    System.out.print(arr[i][j]+ " ");
            }
            System.err.println();
      }
    }
}
