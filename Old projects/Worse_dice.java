import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();

        int diceOne = in.nextInt();
        int diceTwo = in.nextInt();
        HashMap<Integer, Integer> resultsHashMap = new HashMap<>();

        int result = 0;
        int howMany = 1;
        for (int i = 1; i <= diceOne; i++) {
            for (int j = 1; j <= diceTwo; j++) {
                result = i + j;

                //containsKey will check for value linked to that key
                if (!(resultsHashMap.containsKey(result)))
                    resultsHashMap.put(result, 1);

                else if ((resultsHashMap.containsKey(result))) {
                    //get value associated to key
                    howMany = resultsHashMap.get(result);
                    howMany++;

                    //result is acutally dice face here
                    resultsHashMap.put(result, howMany);
                }
            }
        }

        int maximum = Collections.max(resultsHashMap.values());

        for (Map.Entry<Integer, Integer> entry : resultsHashMap.entrySet()) {
            if (entry.getValue() == maximum)
                System.out.println(entry.getKey());
        }
    }
}