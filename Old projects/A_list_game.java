public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();

        int number = in.nextInt();


        int count = 0;
        for (int i = 2; i <= (int) Math.floor(Math.sqrt(number)); ) {
            if (number % i == 0) {
                count++;
                number = number / i;
            } else
                i++;
        }

        if (number != 1) count++;

        System.out.println(count == 0 ? "1" : (number != 1 ? count++ : count));
    }


}
