import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int cases = in.nextInt();

        for (int i = 1; i <= cases; i++) {
            System.out.printf("Case #%d: ", i);

            String word = in.nextLine();

            System.out.println(processWord(word));
        }

    }

    public static String processWord(String word) {

        StringBuilder sb = new StringBuilder();

        int lastDialed = -1;

        char[] letters = word.toCharArray(); //hack this word

        for (char letter : letters) {
            if (letter >= 'a' && letter <= 'o') {
                lastDialed = sortLettersA2P(letter, lastDialed, sb);
            } else if (letter >= 'p' && letter <= 'z') {
                lastDialed = sortLettersP2Z(letter, lastDialed, sb);
            } else if (letter == ' ') {
                lastDialed = sortSpace(lastDialed, sb);
            }
        }
        return sb.toString();
    }

    public static int dialSMS(int howManyPress, StringBuilder sb, int button, int lastAppend) {
        if (button == lastAppend)
            sb.append(" ");

        while (howManyPress > 0) {
            sb.append(button); //button and how long
            howManyPress--;
        }

        return button;

    }


    public static int sortLettersP2Z(char letter, int lastAppend, StringBuilder sb) {
        char c = '\0';
        int key = 0;

        if (letter >= 'p' && letter <= 's') {
            c = (char) (letter - 112); //p ascii is 112
            key = 7;
        } else if (letter >= 't' && letter <= 'v') {
            c = (char) (letter - 116); //t ascii is 116
            key = 8;
        } else if (letter >= 'w' && letter <= 'z') {
            c = (char) (letter - 119); //w ascii is 119
            key = 9;
        }

        return dialSMS(c + 1, sb, key, lastAppend);

    }


    public static int sortLettersA2P(char letter, int lastAppend, StringBuilder sb) {

        char c = (char) (letter - 97);
        int button = (c / 3) + 2; //how many groups of 3 do we need to pass?
        int howManyPress = (c % 3) + 1; //how long in the clutter is the letter we seek
        return dialSMS(howManyPress, sb, button, lastAppend);
    }


    private static int sortSpace(int lastAppend, StringBuilder sb) {

        if (lastAppend == 0) {
            sb.append(" ");
        }
        sb.append("0"); //ascii space = 32

        return 0;
    }
}
