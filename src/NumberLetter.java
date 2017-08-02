/**
 * Created by Vitalii Leshchenko on 02.08.2017.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */

public class NumberLetter {

    public static int letterCount(int limit) {
        int totalSize = 0;
        Map<Integer, String> converter = createConverter();
        for (int i = 1; i <= limit; i++) {
            if (i == 1000) {
                totalSize += converter.get(i).length() + converter.get(1).length();
                continue;
            }

            if (i <= 20) {
                totalSize += converter.get(i).length();
                continue;
            }

            if (i / 100 > 0) {
                totalSize += converter.get(i / 100).length() + converter.get(100).length();
                if (i % 100 != 0) {
                    totalSize += "and".length();
                    if (i % 100 % 10 == 0) {
                        totalSize += converter.get(i % 100).length();
                    } else if (i % 100 < 20) {
                        totalSize += converter.get(i % 100).length();
                    } else {
                        totalSize += converter.get(((i % 100) / 10) * 10).length() + converter.get(i % 100 % 10).length();
                    }
                }
            } else {
                if (i % 10 == 0) {
                    totalSize += converter.get(i).length();
                } else {
                    totalSize += converter.get((i / 10) * 10).length() + converter.get(i % 10).length();
                }
            }
        }
        return totalSize;
    }

    private static Map<Integer, String> createConverter() {
        Map<Integer, String> convertMap = new HashMap<>();
        convertMap.put(0, "");
        convertMap.put(1, "one");
        convertMap.put(2, "two");
        convertMap.put(3, "three");
        convertMap.put(4, "four");
        convertMap.put(5, "five");
        convertMap.put(6, "six");
        convertMap.put(7, "seven");
        convertMap.put(8, "eight");
        convertMap.put(9, "nine");
        convertMap.put(10, "ten");
        convertMap.put(11, "eleven");
        convertMap.put(12, "twelve");
        convertMap.put(13, "thirteen");
        convertMap.put(14, "fourteen");
        convertMap.put(15, "fifteen");
        convertMap.put(16, "sixteen");
        convertMap.put(17, "seventeen");
        convertMap.put(18, "eighteen");
        convertMap.put(19, "nineteen");
        convertMap.put(20, "twenty");
        convertMap.put(30, "thirty");
        convertMap.put(40, "forty");
        convertMap.put(50, "fifty");
        convertMap.put(60, "sixty");
        convertMap.put(70, "seventy");
        convertMap.put(80, "eighty");
        convertMap.put(90, "ninety");
        convertMap.put(100, "hundred");
        convertMap.put(1000, "thousand");
        return convertMap;
    }

}
