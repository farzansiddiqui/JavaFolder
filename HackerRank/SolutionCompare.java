package HackerRank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionCompare {
    public static void main(String[] args) {
        
        List<Integer> a = Arrays.asList(1,4,4);
        List<Integer> b = Arrays.asList(2,3,4);
        System.out.println(compareTriplets(a, b));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> cIntegers = new ArrayList<>();
        boolean areSizeEqual = true;
        int aIncre = 0;
        int bIncrement = 0;
        if (a.size() != b.size()) {
            areSizeEqual = false;
            
        }
        if (areSizeEqual) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).equals(b.get(i))) {
                    System.out.println("nothing");
                }else if (a.get(i) > b.get(i)) {
                        ++aIncre;
                }else if (a.get(i) < b.get(i)) {
                        ++bIncrement;
                }
                
            }
        }
            cIntegers.add(aIncre);
            cIntegers.add(bIncrement);

        return cIntegers;

    }
}
