package Hashing;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class HashSetPro {
    public static void main(String[] args) {
        int[] a = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
       Set<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
                s.add(a[i]);
        }
        System.out.println(s);
        
        TreeSet sorted = new TreeSet<Integer>(s);
        System.out.println("Soring list...");
        System.out.println(sorted);

    }
}