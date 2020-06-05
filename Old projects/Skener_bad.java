import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //custom scanner that throws IOException
        InputReader in = new InputReader();

        int row = in.nextInt();
        int col = in.nextInt();
        int enlargeRow = in.nextInt();
        int enlargeCol = in.nextInt();


        //scanning the content in a matrix
        char[][] scanned = new char[row][col];
        for (int i = 0; i < row; i++) {
            String input = in.nextString();
            for (int j = 0; j < col; j++) {
                scanned[i][j] = input.charAt(j);
            }
        }

        int counterCol = enlargeCol;
        int counterRow = enlargeRow;

        for (int i = 0; i < row; i++) {

            //repeating row pattern as necessary for this row
            while (counterRow > 0) {

                for (int j = 0; j < row; j++) {

                    //repeating col pattern as necessary
                    while (counterCol > 0) {
                        System.out.print(scanned[i][j]);
                        counterCol--;
                    }
                    //reset counter for colonn repetition
                    counterCol = enlargeCol;
                }
                //print a new line for everything but after the last line
                if (i < (row * enlargeRow - 1))
                    System.out.println();

                //decrement row repetition
                counterRow--;
            }

            //reset row repetition for next line
            counterRow = enlargeRow;
        }

    }

}

