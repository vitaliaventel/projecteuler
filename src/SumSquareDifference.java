/**
 * Created by Vitalii Leshchenko on 27.07.2017.
 */

/**
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {

    public static Integer difference(Integer limitValue) {
        return squareOfSum(limitValue) - sumOfSquares(limitValue);
    }

    private static Integer sumOfSquares(Integer limit) {
        Integer result = 0;
        for (Integer i = 1; i <= limit; i++) {
            result += i * i;
        }
        return result;
    }

    private static Integer squareOfSum(Integer limit) {
        Integer value = 0;
        for (Integer i = 1; i <= limit; i++) {
            value += i;
        }
        return value * value;
    }

}
