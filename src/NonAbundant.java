/**
 * Created by Vitalii Leshchenko on 14.08.2017.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */

public class NonAbundant {

    public static long sumAll(int limit) {
        long result = 0;
        List<Integer> abundantList = new ArrayList<>();
        List<Integer> nonAbundantList = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            if (abundant(i)) {
                abundantList.add(i);
            }
        }
        System.out.println(abundantList);
        for (int i = 0; i < limit; i++) {
            if (checkForSum(i, abundantList)) {
                nonAbundantList.add(i);
            }
        }
        for (Integer current : nonAbundantList) {
            result += current;
        }
        return result;
    }

    private static boolean checkForSum(int value, List<Integer> abundantList) {
        int sum = 0;
        for (Integer i : abundantList) {
            if (value % i == 0) {
                return false;
            }
            if (value <= i) {
                break;
            }
        }
        return true;
    }

    private static boolean abundant(int value) {
        int sum = 0;
        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        if (sum <= value) {
            return false;
        }
        return true;
    }

}
