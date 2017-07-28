/**
 * Created by Vitalii Leshchenko on 28.07.2017.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class SummationOfPrimes {


    public static long sumPrimes(int limit) {
        long resultSum = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                resultSum += i;
            }
        }
        return resultSum;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

}
