import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String tests = scan.nextLine();
        int n = Integer.parseInt(tests);

        String sentence = scan.nextLine();
        boolean fishy = false;
        String[] counting = sentence.split(" ");

        if(n!= counting.length)
                fishy= true;

        for (int i = 0; i < n; i++) {
            if (!counting[i].equals("mumble")) {
                if ((Integer.parseInt(counting[i])) != i + 1) {
                    fishy = true;
                    break;
                }
            }
        }
        System.out.println(fishy? "something is fishy": "makes sense");
    }
}