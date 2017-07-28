/**
 * Created by Vitalii Leshchenko on 28.07.2017.
 */

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

public class Nprime {

    public static Integer findPrime(Integer position) {
        Integer counter = 0;
        Integer currentValue = 2;

        while (true) {
            if (isPrime(currentValue)) {
                counter++;
            }
            if (counter.equals(position)) {
                break;
            }
            currentValue++;
        }

        return currentValue;
    }

    private static boolean isPrime(Integer number) {
        int divided = 0;
        for (Integer i = 1; i <= number; i++) {
            if (number % i == 0) {
                divided++;
            }
        }
        return divided == 2 ? true : false;
    }

}
