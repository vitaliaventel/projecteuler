/**
 * Created by Vitalii Leshchenko on 02.08.2017.
 */

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */

public class PowerDigit {

    public static int sum(int number, int power) {
        BigInteger value = BigInteger.valueOf(number);
        value = value.pow(power);
        return addAllDigits(value.toString());
    }

    private static int addAllDigits(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result += Character.getNumericValue(number.charAt(i));
        }
        return result;
    }

}
