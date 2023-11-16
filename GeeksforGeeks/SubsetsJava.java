package GeeksforGeeks;

import java.util.ArrayList;
import java.util.List;

public class SubsetsJava {
    public static void main(String[] args) {
        List<Integer> array = List.of(1, 2, 3);
        List<List<Integer> > res = subsets(array);
 
        // Print the generated subsets
        for (List<Integer> subset : res) {
            for (Integer num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void calcSubset(List<Integer> A, List<List<Integer>>res, List<Integer> subset, int index){

        // add the current subsets to the result list.
                res.add(new ArrayList<>(subset));

                // General subsets by recursively including and excluding elements.
                
                for (int i = index; i <A.size(); i++) {
                     // Include the current element in the subset
                    subset.add(A.get(i));

                      // Recursively generate subsets with the current
            // element included
            calcSubset(A, res, subset, i + 1);
             // Exclude the current element from the subset
            // (backtracking)
            subset.remove(subset.size() - 1);
                }
    }

    static List<List<Integer>> subsets(List<Integer> A){
        List<Integer> subset = new ArrayList<>();
        List<List<Integer> > res = new ArrayList<>();
 
        int index = 0;
        calcSubset(A, res, subset, index);
        return res;

    }
    
}
