import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Kattio io = new Kattio(System.in, System.out);

        int[] arrayTal = new int[3];
        HashMap<String, Integer> hashMapTal = new HashMap<>();

        for (int i = 0; i < arrayTal.length; i++) {
            arrayTal[i] = io.getInt();
        }

        Arrays.sort(arrayTal);

        hashMapTal.put("A", arrayTal[0]);
        hashMapTal.put("B", arrayTal[1]);
        hashMapTal.put("C", arrayTal[2]);


        String abc = io.getWord();
        String key1 = abc.substring(0, 1);
        System.out.print(hashMapTal.get(key1) + " ");
        String key2 = abc.substring(1, 2);
        System.out.print(hashMapTal.get(key2) + " ");
        String key3 = abc.substring(2, 3);
        System.out.print(hashMapTal.get(key3));

    }
}
