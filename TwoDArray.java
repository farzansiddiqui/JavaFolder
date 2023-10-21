public class TwoDArray {
    public static void main(String[] args) {
        int rowSize  = 2;
        int columnSize  = 4;
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
                System.out.print(myArray[i][j]+" ");
            }
            
        }
        System.out.println();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j <columnSize; j++) {
                
                System.out.print(myArray[i][j]+" ");


            }
            System.out.println();
        }


    }
}
 //(0, 0) (0, 1) (0, 2) (0, 3) 
//(1, 0) (1, 1) (1, 2) (1, 3) 