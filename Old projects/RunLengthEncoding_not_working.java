import java.io.IOException;

import static java.lang.Character.isDigit;

public class Main {


    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        String input = in.nextLine();
        String branch = input.substring(0, 1);
        char[] message = input.substring(2).toCharArray();

        switch (branch) {
            case "E":
                System.out.println(encoding(message));


            case "D":
                System.out.println(decoding(message));

        }

    }

    public static String encoding(char[] message) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < message.length - 1; i++) {

            if (message[i] != message[i + 1] || i + 1 == message.length - 1) {
                sb.append(message[i]).append((message.length - 1 == i + 1) ? count + 1 : count);
                count = 1;
            } else
                count++;
        }
        return sb.toString();

    }

    public static String decoding(char[] message) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.length; i++) {

            if (isDigit(message[i])) {
                int count = message[i] - '0';
                for (int k = 0; k < count; k++)
                    sb.append(message[i - 1]);
            }

        }
        return sb.toString();
    }
}