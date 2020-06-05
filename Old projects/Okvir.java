import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int lines = in.nextInt();
        int charILine = in.nextInt();
        int up = in.nextInt();
        int left = in.nextInt();
        int right = in.nextInt();
        int down = in.nextInt();

        String[] words = in.nextStringArray(lines);
        
        int horizontalCount = lines + up + down;
        int verticalCount = charILine + left + right;

        char[][] checkMatta = appendage(horizontalCount, verticalCount);
        inception(checkMatta, words, up, left, lines, charILine);

        for (int i = 0; i < horizontalCount; i++) {
            for (int j = 0; j < verticalCount; j++) {
                System.out.print(checkMatta[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] inception(char[][] checkMatta, String[] words, int up, int left, int lines, int charInLine) {

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < charInLine; j++) {
                checkMatta[up + i][left + j] = words[i].charAt(j);
            }
        }
        return checkMatta;
    }


    public static char[][] appendage(int horizontalCount, int verticalCount) {
        char[][] checkMatta = new char[horizontalCount][verticalCount];

        for (int i = 0; i < horizontalCount; i++) {
            for (int j = 0; j < verticalCount; j++) {

                if ((i + j) % 2 == 0)
                    checkMatta[i][j] = '#';
                else
                    checkMatta[i][j] = '.';

            }
        }
        return checkMatta;
    }

}