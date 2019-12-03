public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];

        Arrays.fill(primes, true);

        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i; j * i < primes.length; j++) {
                    primes[i * j] = false;
                }
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
