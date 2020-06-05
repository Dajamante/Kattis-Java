import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();

        String sentence = scan.nextLine();
        boolean fishy = false;
        String[] counting = sentence.split(" ");

        for (int i = 0; i < counting.length; i++) {
            if (!counting[i].equals("mumble")) {
                if ((Integer.parseInt(counting[i])) != (i + 1)) {
                    System.out.println("something is fishy");
                    fishy = true;
                    break;
                }
            }
        }
        if (!fishy) System.out.println("make sense");
    }
}
