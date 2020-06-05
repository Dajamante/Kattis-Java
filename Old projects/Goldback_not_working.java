public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();

        //int testCases = in.nextInt();

        int number = in.nextInt();
        boolean restIsPrime;
        boolean goldBackProved = false;

        for (int i = 2; i <= (int) Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                restIsPrime = testRestForPrimity(number, i);
                if (restIsPrime) {
                    processGoldbach(number, i);
                    goldBackProved = true;
                }
            }
        }

        if (!goldBackProved)
            System.out.println(number);

    }

    private static boolean testRestForPrimity(int number, int i) {
        boolean isPrime = true;
        int rest = number - i;
        for (int j = 2; j <= (int) Math.floor(Math.sqrt(number)); ) {
            if (rest % i == 0 && rest != i) {
                isPrime = false;
                break;
            } else
                j++;
        }
        return isPrime;
    }

    private static void processGoldbach(int number, int i) {
        int rest = number - i;
        System.out.println(i + " " + rest);

    }
}

