public class JavaSorting {
    public static void main(String[] args) {
        int[] number = getArray();
        int tempArray = 0;
        
        for (int i = 0; i < number.length-1; i++) {
            for (int j =  i+1; j < number.length; j++) {
                    if (number[i] > number[j]) { // 1,2
                            tempArray = number[i]; // 2633,
                            number[i] = number[j]; // 54
                            number[j] = tempArray;  // 25633
                    }
            }
           
        }
        printArray(number);
    }
    public static int[] getArray() {
         int[] printArray = {2366,54,78,53,65,433,43,230};
        return printArray;
    }

   public static void printArray(int[] printArray){  
            for (int i = 0; i < printArray.length; i++) {
                System.out.print(printArray[i]+" ");
            }
            System.out.println("");
   }
    
}
