import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();

        String word = in.nextString();

        char[] half = word.substring(0, word.length() / 2).toCharArray();
        char[] secondHalf = word.substring(word.length() / 2).toCharArray();

        int rotationA  = calculateRotation(half);
        int rotationB = calculateRotation(secondHalf);

        half = rotate(half, rotationA);
        secondHalf = rotate(secondHalf, rotationB);

        char[] result = rotateOneByTheOther(half, secondHalf);
        System.out.println(result);
    }

    public static int calculateRotation(char[] array) {
        int rotation = 0;
        for (char c : array) {
            rotation += c - 65;
        }
        return rotation;
    }
    public static char[] rotate(char[] array, int rotation) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (((array[i] - 'A' + rotation) % 26) + 'A');
        }
        return array;
    }

    public static char[] rotateOneByTheOther(char[] arrayA, char[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (char) (((arrayA[i] -'A' + arrayB[i] -'A') % 26) + 'A');
        }
        return arrayA;
    }
}