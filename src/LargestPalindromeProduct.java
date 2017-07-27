/**
 * Created by Vitalii Leshchenko on 27.07.2017.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class LargestPalindromeProduct {

    public final static Integer LOW_LIMIT = 100;
    public final static Integer HIGH_LIMIT = 1000;

    public static Integer findPalindrome() {
        List<Integer> palindromes = new ArrayList<>();
        for (Integer i = LOW_LIMIT; i < HIGH_LIMIT; i++) {
            for (Integer j = LOW_LIMIT; j < HIGH_LIMIT; j++) {
                Integer product = i * j;
                if (checkPalindrome(product)) {
                    palindromes.add(product);
                }
            }
        }
        return Collections.max(palindromes);
    }

    private static boolean checkPalindrome(Integer value) {
        return String.valueOf(value).equals(new StringBuilder(String.valueOf(value)).reverse().toString());
    }

}
