/**
 * Created by Vitalii Leshchenko on 07.08.2017.
 */

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */

public class FactorialDigit {

    public static int sum(int factorial) {
        BigInteger value = BigInteger.ONE;
        for (int i = 1; i < factorial; i++) {
            value = value.multiply(BigInteger.valueOf(i));
        }
        return allDigitsSum(value.toString());
    }

    private static int allDigitsSum(String value) {
        int result = 0;
        for (int i = 0; i < value.length(); i++) {
            result += Character.getNumericValue(value.charAt(i));
        }
        return result;
    }

}
