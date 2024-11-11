import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
      int arr[] = {1,10,2,11,13,12};

      for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
              int temp = 0;
                  if (arr[i] > arr[j]) {
                      temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
            }
      }
      System.out.print(Arrays.toString(arr)+" ");
    }
}
