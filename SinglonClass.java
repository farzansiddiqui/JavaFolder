
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SinglonClass {
    public static void main(String[] args) {
        int[] arr = { 100, 1, 500, 34, 100, 111, 134 };

        ArrayList<DataModel> arrayList = new ArrayList<>();

        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hMap.put(arr[i], hMap.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (entry.getValue() > 1) {
                arrayList.add(new DataModel(entry.getKey(), entry.getValue()));

            }
        }
        for (int index = 0; index < arrayList.size(); index++) {
                System.out.println(arrayList.get(index).getKey()+" "+arrayList.get(index).getValue());
        }
    }
}

class DataModel {
    int key;
    int value;

    DataModel(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

}
