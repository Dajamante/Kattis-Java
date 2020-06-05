import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        char[] letters = in.nextString().toCharArray();
        int numberOfT = 0;
        int numberOfC = 0;
        int numberOfG = 0;


        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'T')
                numberOfT++;
            if (letters[i] == 'C')
                numberOfC++;
            if (letters[i] == 'G')
                numberOfG++;
        }

        int bonus = (int) Integer.min(numberOfC, Integer.min(numberOfG, numberOfT)) * 7;

        System.out.println((int) (Math.pow(numberOfC, 2) + Math.pow(numberOfG, 2) + Math.pow(numberOfT, 2) + bonus));


    }


}

