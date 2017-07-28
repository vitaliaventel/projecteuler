/**
 * Created by Vitalii Leshchenko on 28.07.2017.
 */


/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class SpecialPythagoreanTriplet {

    public static int pythagoreanProduct(int sumValue) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i < sumValue; i++) {
            for (int j = 1; j < sumValue; j++) {
                if (i + j + Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2)) == sumValue) {
                    a = i;
                    b = j;
                }
            }
        }
        c = sumValue - a - b;
        return a * b * c;
    }

}
