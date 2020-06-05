import java.io.*;

public class Main {


    public static void main(String[] args) {

        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = reader.readLine()) != null) {
                String pattern = line;
                String text = reader.readLine();
                check(pattern, text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void check(String pattern, String text) {
        if (pattern.length() == text.length() && pattern.equals(text))
            System.out.println("1");

        else {
            for (int i = 0; i <= text.length() - pattern.length(); i++) {
                if (pattern.equals(text.substring(i, i + pattern.length())))
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
