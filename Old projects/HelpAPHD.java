public class Main {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        for (int i = 0; i < n; i++) {
            String word = io.getWord();
            if (word.equals("P=NP"))
                System.out.println("skipped");

            else {
                String[] tal = word.split("\\+");
                System.out.println(Integer.parseInt(tal[0]) + Integer.parseInt(tal[1]));
            }
        }
    }
}
