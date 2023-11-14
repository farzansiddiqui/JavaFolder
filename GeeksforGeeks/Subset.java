package GeeksforGeeks;
public class Subset {
    public static void main(String[] args) {
                int[] arr = {1,2,3};
                printSubsets(arr, 0, new int[arr.length]);
    }
    
    static void printSubsets(int[] arr, int index, int[] subsets){
            if (index == arr.length) {
                for (int i = 0; i < subsets.length; i++) {
                        if (subsets[i] == 1) {
                            System.out.print(arr[i] + " ");
                        }
                }
                System.out.println();
                return;
            }
                subsets[index] = 1;
                printSubsets(arr, index + 1, subsets);
            
            subsets[index] = 0;
            printSubsets(arr, index + 1, subsets);
    }
}
