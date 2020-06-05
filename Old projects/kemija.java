import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        char[] letters = sentence.toCharArray();

        int i = 0;
        while (i < letters.length)
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                System.out.print(letters[i]);
                i += 3;
            }else{
                System.out.print(letters[i]);
                i++;
            }

    }
}

