import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int cases = in.nextInt();

        for (int i = 1; i <= cases; i++) {
            System.out.printf("Case #%d :", i);

            String word = in.nextLine();

            System.out.println(processWord(word));

            System.out.print(" "); //line at the end of this test case}
        }

    }

    public static String processWord(String word) {
        StringBuilder sb = new StringBuilder();
        int lastAppend = -1;
        char[] letters = word.toCharArray(); //hack this word
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'z') {
                if (lastAppend == 9) {
                    sb.append(" ");
                }
                sb.append("9999"); //special case for z
                lastAppend = 9;

            } else if (letters[i] == ' ') {
                if (lastAppend == 0) {
                    sb.append(" ");
                }
                sb.append("0"); //ascii space = 32
                lastAppend = 0;

            } else {
                letters[i] = (char) (letters[i] - 97);
                int knapp = letters[i] / 3 + 2; //how many groups of 3 do we need to pass?
                if (knapp == lastAppend) {
                    sb.append(" ");
                }
                int howManyPress = letters[i] % 3; //how long in the clutter is the letter we seek
                while (howManyPress + 1 > 0) {
                    sb.append(knapp); //button and how long
                    howManyPress--;
                }
                lastAppend = knapp;
            }

        }

        return sb.toString();
    }
}

