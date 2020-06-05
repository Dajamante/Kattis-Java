import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int lines = in.nextInt();
        int charILine = in.nextInt();
        int up = in.nextInt();
        int left = in.nextInt();
        int right = in.nextInt();
        int down = in.nextInt();

        int verticalCount = lines + up + down;
        int horizontalCount = charILine + left + right;

        String checkMatta = appendage(verticalCount, horizontalCount);

        System.out.println(checkMatta);
    }

    public static String appendage(int verticalCount, int horizontalCount) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < (verticalCount * horizontalCount); i++) {
            for (int j = 0; j < (verticalCount * horizontalCount); j++) {
                if
            }

        }
        while (count < (verticalCount * horizontalCount)) {

            sb.append("#");
            count++;

            sb.append(".");
            count++;

        }

        for (int i = horizontalCount; i < verticalCount * horizontalCount; i += horizontalCount) {
            sb.insert(i + 1, "\n");
        }

        return sb.toString();
    }

}

