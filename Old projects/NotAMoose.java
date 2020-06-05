import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        InputReader in = new InputReader();

        int l = in.nextInt();
        int r = in.nextInt();

        System.out.println((l == 0 && r == 0) ? "Not a moose" :
                ((l == r) ? "Even " + r * 2 : "Odd " + Integer.max(l, r) * 2));


    }
}
