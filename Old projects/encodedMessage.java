public class Main {

    public static void main(String[] args) {

        Kattio io = new Kattio(System.in);

        int tests = io.getInt();
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < tests; k++) {
            String phrase = io.getWord();

            int row = (int) Math.sqrt(phrase.length());
            int start = row;
            int period = row;


            char[] array = phrase.toCharArray();

            for (int j = 0; j < row; j++) {
                for (int i = start - 1; i < phrase.length(); i += period) {
                    sb.append(array[i]);
                }
                start--;
            }

            sb.append("\n");

        }
        System.out.println(sb.toString());
    }


}


