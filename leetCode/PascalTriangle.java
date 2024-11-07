package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
 public static void main(String[] args) {
   System.out.println(printList(3));
  printPascal(5);
    
 }  

 static List<List<Integer>> printList(int numbsRows){
   if (numbsRows == 0) return new ArrayList<>();
   
      if (numbsRows == 0) {
         List<List<Integer>> tempList = new ArrayList<>();
           tempList.add(Arrays.asList(numbsRows));
            return tempList;
      }
      List<List<Integer>> prevRows = printList(numbsRows - 1);
      List<Integer> newRow = new ArrayList<>();

      for (int i = 0; i < numbsRows; i++) {
             newRow.add(1);
      }

      for (int i = 1; i < numbsRows - 1; i++) {
         newRow.set(i, prevRows.get(numbsRows - 2).get(i - 1) + prevRows.get(numbsRows - 2).get(i));
      }
      prevRows.add(newRow);

   return prevRows;
 }

 static int fact(int fact){
  int multi = 1;
    if (fact == 0 || fact == 1) {
        return multi;
    }
    for (int i = 1; i <= fact; i++) {
          multi*=i;
    }
  return multi;
 }


 static void printPascal(int nums){
    for (int i = 0; i < nums; i++) {
      for (int j = 0; j <= i; j++) {
          System.out.print(fact(i) / fact(j) * fact(i - j)+" ");
      }
      System.out.println();
    }
 }


}
