/**
 * Created by Vitalii Leshchenko on 27.07.2017.
 */

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class SmallestMultiple {

    public static Integer smallest() {
        Integer result = 1;
        boolean status = false;
        while (true) {
            for (int i = 1; i <= 20; i++) {
                if (result % i == 0) {
                    status = true;
                } else {
                    result++;
                    status = false;
                    break;
                }
            }
            if (status) {
                break;
            }
        }
        return result;
    }

}
