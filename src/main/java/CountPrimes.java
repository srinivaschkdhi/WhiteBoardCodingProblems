import java.util.Arrays;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];

        Arrays.fill(primes, true);

        for (int i = 2; i * i < primes.length; i++) {
//            if (primes[i]) {/if if is prime factor, to avoid duplicte effort (all numbers divisible by 4,8..6,9,12 can be covered by 2,3...)
            for (int j = i; j * i < primes.length; j++) {
                primes[i * j] = false;
            }
        }


        int primeCount = 0;

        for (int i = 2; i < primes.length; i++) {
            if (primes[i])
                primeCount += 1;
        }

        return primeCount;
    }
}
