import java.io.IOException;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {
        HashSet<String> hashSetCities;
        InputReader in = new InputReader();

        int testCases = in.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int trips = in.nextInt();
            hashSetCities = new HashSet<>();

            for (int j = 0; j < trips; j++) {
                hashSetCities.add(in.nextString());
            }

            System.out.println(hashSetCities.size());
            hashSetCities.clear();

        }
    }
}
