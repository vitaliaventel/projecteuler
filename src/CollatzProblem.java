/**
 * Created by Vitalii Leshchenko on 01.08.2017.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public class CollatzProblem {

    public static long findLongestCollatzNumber(long limit) {

        long collatzMax = 0;
        long returnValue = 0;

        for (long i = 1; i < limit; i++) {
            long stop = i;
            long counter = 0;
            while (stop != 1) {
                if (stop % 2 == 0) {
                    stop /= 2;
                } else {
                    stop = stop * 3 + 1;
                }
                counter++;
            }

            if (collatzMax < counter) {
                collatzMax = counter;
                returnValue = i;
            }
        }

        return returnValue;
    }

}
