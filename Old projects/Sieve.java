import java.util.Arrays;

/**
 * Implementation of the Sieve of Eratosthenes algorithm for checking if a
 * number is prime or not. The implementation is lacking in error-checking
 * and optimization, and needs some patching up!
 *
 * @author Aïssata Maiga
 * @version 2018-11-14
 */
public class Sieve {
    private static final int LIMIT = (int) Math.pow(2, 26);
    private boolean[] primeCache;
    private boolean firstTimeRunning = true;

    /**
     * Check if a number is prime or not!
     * <p>
     * Note that prime[n] denotes the primality of number n.
     *
     * @param number An integer value to be checked for primality.
     * @return true if number is prime, false otherwise.
     */
    public boolean isPrime(int number) {

        exceptionIfIllegalArg(number);

        if (firstTimeRunning) {
            primeCache = new boolean[number];
            firstTimeRunning = false;
        }
        if (primeCache.length > number) {
            return primeCache[number];
        } else {
            boolean[] prime = sieve(number);
            primeCache = prime;
            return prime[number];
        }


    }

    public int getLimit() {
        return LIMIT;
    }

    private void exceptionIfIllegalArg(int number) {

        if (number <= 1)
            throw new IllegalArgumentException();

        if (number > LIMIT)
            throw new IllegalArgumentException();
    }

    private boolean[] sieve(int number) {
        boolean[] prime = new boolean[number + 1]; // + 1 because of 0-indexing
        Arrays.fill(prime, true); // assume all numbers are prime
        int sqrt = (int) Math.floor(Math.sqrt(number));
        for (int i = 2; i <= sqrt; i++) {
            if (prime[i])
                for (int j = i * 2; j < prime.length; j += i)
                    prime[j] = false; // mark multiples of i as not prime

        }
        return prime;
    }

}




