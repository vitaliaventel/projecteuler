/**
 * Created by Vitalii Leshchenko on 28.07.2017.
 */

/**
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * Let us list the factors of the first seven triangle numbers:
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * What is the value of the first triangle number to have over five hundred divisors?
 */

public class HighlyDivisible {

    public static long findDivisbleValue(int factors) {
        long counter = 2;
        int n = 2;
        int divs = 0;
        while (true) {

            for (long i = 1; i <= (long) Math.sqrt(counter); i++) {
                if (counter % i == 0) {
                    divs += 2;
                }
            }

            if (divs >= factors) {
                break;
            }

            divs = 0;
            counter = n * (n + 1) / 2;
            n++;
        }

        return counter;
    }

}
