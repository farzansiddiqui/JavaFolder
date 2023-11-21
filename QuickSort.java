import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }

    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= pivot) {
                    i++;

                    //swap arr[i] and arr[j]..

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }    
        }

        // swap arr[i + 1] and arr[high] (Pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
