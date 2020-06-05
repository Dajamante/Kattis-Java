import java.io.IOException;

import static java.lang.Character.*;

public class Main {


    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();

        double whiteSpace = 0;
        double lowerCase = 0;
        double upperCase = 0;
        double symbols = 0;

        char[] bullshitToArray = in.nextString().toCharArray();
        for (char c : bullshitToArray) {

            if (c == '_')
                whiteSpace++;
            else if (isLowerCase(c))
                lowerCase++;
            else if (isUpperCase(c))
                upperCase++;
            else if (c > 32 && c < 127)
                symbols++;

        }

        System.out.println(whiteSpace / bullshitToArray.length);
        System.out.println(lowerCase / bullshitToArray.length);
        System.out.println(upperCase / bullshitToArray.length);
        System.out.println(symbols / bullshitToArray.length);


    }

}

