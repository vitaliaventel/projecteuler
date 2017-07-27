/**
 * Created by Vitalii Leshchenko on 27.07.2017.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */


public class LargestPrimeFactor {

    public static Long findFactor(Long number) {

        List<Long> factors = new ArrayList<>();
        for (Long i = (long) Math.sqrt(number); i > 0; i--) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return prime(factors);
    }

    private static Long prime(List<Long> facs) {
        List<Long> primes = new ArrayList<>();

        for (Long i : facs) {
            int counter = 0;
            for (Long j = 1l; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primes.add(i);
            }
        }

        return Collections.max(primes);
    }

}
