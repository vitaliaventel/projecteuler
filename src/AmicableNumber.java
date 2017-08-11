/**
 * Created by Vitalii Leshchenko on 10.08.2017.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * Evaluate the sum of all the amicable numbers under 10000.
 */

public class AmicableNumber {

    public static int amicable(int limit) {
        int sumAll = 0;
        Map<Integer, Integer> divisors = divisorMap(limit);
        for (int i = 1; i < limit; i++) {
            int dA = divisors.get(i);
            if (dA < limit && dA > 0) {
                int dB = divisors.get(dA);
                if (dB == i && dA != dB) {
                    sumAll += i;
                }
            }
        }
        return sumAll;
    }

    private static Map<Integer, Integer> divisorMap(int limit) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < limit; i++) {
            int divisorSum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisorSum += j;
                }
            }
            map.put(i, divisorSum);
        }
        return map;
    }

}
