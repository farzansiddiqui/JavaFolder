import java.util.*;

public class SortingJava{
    public static void main(String[] args) {
      
        int[] sortNumber = {23,45,65,64,67,54,34,24};
        startPattern();
        reversePattern();
       

        for (int i = 0; i < sortNumber.length; i++) {
            for (int j = i+1; j < sortNumber.length; j++) {
                int temp = 0;
                if (sortNumber[i] > sortNumber[j]) {
                    temp = sortNumber[i];
                    sortNumber[i] = sortNumber[j];
                    sortNumber[j] = temp;
                }
            }
        }
        printArray(sortNumber);

    }
    public static void printArray(int[] printArray){
        for (int i = 0; i < printArray.length; i++) {
            System.out.print(printArray[i]+" ");
        }
        System.out.println("");
    }
    public static void findThirdNumber(int[] arrayList, int sizeArray){
           
        for (int i = 0; i < arrayList.length; i++) {

        }
    }
 public static void startPattern() {
            int a = 5;
            for (int i = 1; i < a; i++) {
                for (int j = 0; j < i ; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            } 
    }

    public static void reversePattern() {
        int a = 5;
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}