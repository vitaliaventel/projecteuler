/**
 * Created by Vitalii Leshchenko on 27.07.2017.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class MultiplesOf3And5 {

    public static Integer sum(Integer limitValue) {
        List<Integer> correctValues = new ArrayList<>();
        for (Integer i = 0; i < limitValue; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                correctValues.add(i);
            }
        }
        return sumAll(correctValues);
    }

    private static Integer sumAll(List<Integer> storage) {
        Integer result = 0;
        for (Integer value : storage) {
            result += value;
        }
        return result;
    }
}
