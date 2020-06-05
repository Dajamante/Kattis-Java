import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        String word2BeGuessd = in.nextString();

        char[] alphabet = in.nextString().toCharArray();

        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();

        int guesses = 10;
        int victoryPoints = 0;

        for (int i = 0; i < word2BeGuessd.length(); i++)
            hashSet.add(word2BeGuessd.charAt(i));

        Character[] converted = hashSet.toArray(new Character[0]);
        int victory = converted.length;


        for (int i = 0; i < alphabet.length; i++) {
            if (hashSet.contains(alphabet[i])) {
                victoryPoints++;
                hashSet.remove(alphabet[i]);
            } else {
                guesses--;
            }

            if (victoryPoints >= victory) {
                System.out.println("WIN");
                break;
            }

            if (guesses == 0) {
                System.out.println("LOSE");
                break;
            }

        }

    }

}



