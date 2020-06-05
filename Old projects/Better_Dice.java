public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();

        int m = in.nextInt();
        int n = in.nextInt();
        if (m == n) System.out.println(m + 1);

        else {
            int bigGirl = Integer.max(m, n) + 1;
            int baby = Integer.min(m, n) + 1;

            for (int i = baby; i <= bigGirl; i++) {
                System.out.println(i);
            }
        }
    }
}