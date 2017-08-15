/**
 * Created by Vitalii Leshchenko on 15.08.2017.
 */

import java.math.BigInteger;

/**
 * The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
 * Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */

public class SelfPower {

    public static String lastTenDigits(int limit){
        BigInteger result = BigInteger.ZERO;
        BigInteger powValue;

        for(int i = 1; i <= limit; i++){
            powValue = BigInteger.valueOf(i);
            result = result.add(powValue.pow(i));
        }

        return result.toString().substring(result.toString().length() - 10, result.toString().length());
    }

}
