public class TwoDArray {
    public static void main(String[] args) {
        int rowSize = 2;
        int columnSize = 4;
        int myArray[][] = new int[rowSize][columnSize];
        int count = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                myArray[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Result Matrix");
        int[][] res = new int[rowSize][columnSize];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                res[i][j] = myArray[i][j] + myArray[i][j];
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int[][] submatBoundaries = { { 0, 0, 1, 2 },
                { 1, 1, 2, 2 } };
        for (int[] submatBoundary : submatBoundaries) {
            System.out.println(sumOfSubmatrix(mat, submatBoundary));
        }

    }

    private static int sumOfSubmatrix(int[][] mat, int[] submatBoundary) {
        int[][] dp = new int[mat.length][mat[0].length];
        dp[0][0] = mat[0][0];
        for (int i = 1; i < mat.length; i++) {
            dp[i][0] = dp[i - 1][0] + mat[i][0];
        }
        for (int i = 1; i < mat[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + mat[0][i];
        }
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + mat[i][j];
            }
        }
        return dp[submatBoundary[2]][submatBoundary[3]]
                - (submatBoundary[0] > 0 ? dp[submatBoundary[2]][submatBoundary[0] - 1] : 0)
                - (submatBoundary[1] > 0 ? dp[submatBoundary[1] - 1][submatBoundary[3]] : 0)
                + (submatBoundary[0] > 0 && submatBoundary[1] > 0 ? dp[submatBoundary[1] - 1][submatBoundary[0] - 1]
                        : 0);
    }
}
