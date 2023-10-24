import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class HighestSal {
    public static void main(String[] args) {
        ArrayList<Employes> arrayList = new ArrayList<Employes>();
        arrayList.add(new Employes("Farzan", 255));
        arrayList.add(new Employes("Shabina", 258));
        arrayList.add(new Employes("Cutie", 856));
        arrayList.add(new Employes("Fur", 1258));
        arrayList.add(new Employes("Fuffr", 588));
        arrayList.add(new Employes("padd", 988));

        ArrayList<Integer> newaArrayList = new ArrayList<>();
        newaArrayList.add(25);
        newaArrayList.add(58);
        newaArrayList.add(589);
        newaArrayList.add(15);
        newaArrayList.add(78);
        newaArrayList.add(8);
        newaArrayList.add(20);
        Collections.sort(newaArrayList);
        for (int i = 0; i < newaArrayList.size(); i++) {
                System.out.println(newaArrayList.get(i));
        }
    
        Collections.sort(arrayList,Comparator.comparing(Employes::getSalry));
        System.out.println(arrayList.get(arrayList.size()-1).getSalry());
    }

}

 class Employes {
     public String name;
    public int salry;

    Employes(String name, int salry){
        this.name = name;
        this.salry = salry;
    }

    public int getSalry(){
        return salry;
    }

}

 