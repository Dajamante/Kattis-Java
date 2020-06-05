import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();

        //to make sure that same university does not reap all rewards
        HashMap<String, String> universityRanking = new HashMap<>();

        int testCases = in.nextInt();

        //counter for 12 rewards
        int top12best = 12;

        for (int i = 0; i < testCases; i++) {
            String univName = in.nextString();
            String team = in.nextString();
            if (!universityRanking.containsKey(univName)) {
                universityRanking.put(univName, team);

                //the HashMap universityRanking can have more than 12 unique teams.
                if (top12best > 0)
                    System.out.println(univName + " " + team);
                top12best--;

            }
        }
    }
}