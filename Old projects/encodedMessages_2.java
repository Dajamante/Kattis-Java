public class Main {

    public static void main(String[] args) {

        //this is a custom input reader
        Kattio io = new Kattio(System.in);

        int numberOfTests = io.getInt();


        for (int k = 0; k < numberOfTests; k++) {

            String phrase = io.getWord();

            //the length is always a square
            int row = (int) Math.sqrt(phrase.length());
            int col = row;


            char[][] doubleArray = new char[row][col];
            int index = 0;

            //reading in characters
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    doubleArray[i][j] = phrase.charAt(index);
                    index++;
                }
            }

            //printing out "rotated" characters
            for (int j = col - 1; j >= 0; j--) {
                for (int i = 0; i < row; i++) {
                    System.out.print(doubleArray[i][j]);
                }
            }
            System.out.println();
        }

    }

}