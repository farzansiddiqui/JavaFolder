import java.util.Arrays;

public class MergedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7};
        int[] addValue = new int[4];
        addValue[0] = 1;
        addValue[1] = 2;
        addValue[2] = 3;
        addValue[1] = 4;
        System.out.println(Arrays.toString(addValue));
      int[] mergedArray =   mergedArray(arr1, arr2);
        System.out.println("Merged Arrary :"+Arrays.toString(mergedArray));
        
    }
    public static int[] mergedArray(int[] arr1, int[] arr2){
        int[] mergedTwoArrary = new int[arr1.length+arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            mergedTwoArrary[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
                mergedTwoArrary[arr1.length + i] = arr2[i];
                //System.out.println(mergedTwoArrary[i]);
        }
      

        for (int i = 0; i < mergedTwoArrary.length; i++) {
                for (int j = i+1; j < mergedTwoArrary.length; j++) {
                    if (mergedTwoArrary[i] > mergedTwoArrary[j]) {
                        int temp = mergedTwoArrary[i]; 
                        mergedTwoArrary[i] = mergedTwoArrary[j];
                        mergedTwoArrary[j] = temp;
                    }
                        
                }

        }

        return mergedTwoArrary;

    }
    
}
