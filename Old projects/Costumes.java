
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        int numberCostumes = io.getInt();

        ArrayList<String> costumeList = new ArrayList<>();
        for (int i = 0; i < numberCostumes; i++) {
            costumeList.add(io.getWord());
        }


        HashMap<String, Integer> costumesMap = new HashMap<>();

        Integer howMany;
        for (int i = 0; i < numberCostumes; i++) {

            if (!(costumesMap.containsKey(costumeList.get(i))))
                costumesMap.put(costumeList.get(i), 1);

            else if ((costumesMap.containsKey(costumeList.get(i)))) {
                howMany = costumesMap.get(costumeList.get(i));
                howMany++;
                costumesMap.put(costumeList.get(i), howMany);
            }
        }

        int min = Collections.min(costumesMap.values());
        ArrayList<String> cleanCostumes = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : costumesMap.entrySet()) {
            if (entry.getValue() == min)
                cleanCostumes.add(entry.getKey());
        }
        Collections.sort(cleanCostumes);

        for (String s : cleanCostumes)
            System.out.println(s);
    }


}
