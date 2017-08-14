import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Vitalii Leshchenko on 27.07.2017.
 */

public class Runner {

    public static void main(String[] args) {
        //MultiplesOf3And5
        System.out.println("Task 1, result = " + MultiplesOf3And5.sum(1000));

        //Even Fibonacci sum
        System.out.println("Task 2, result = " + EvenFibonacci.sumOfEvenFibonacci(4000000));

        //Sum square difference
        System.out.println("Task 3, result = " + LargestPrimeFactor.findFactor(600851475143L));

        //Largest palindrome product
        System.out.println("Task 4, result = " + LargestPalindromeProduct.findPalindrome());

        //Smallest multiple
        System.out.println("Task 5, result = " + SmallestMultiple.smallest());

        //Sum square difference
        System.out.println("Task 6, result = " + SumSquareDifference.difference(100));

        //N prime
        System.out.println("Task 7, result = " + Nprime.findPrime(10001));

        //Largest product in a series
        System.out.println("Task 8, result = " + LargestProductSeries.product(13));

        //Largest product in a series
        System.out.println("Task 9, result = " + SpecialPythagoreanTriplet.pythagoreanProduct(1000));

        //Largest product in a series
        System.out.println("Task 10, result = " + SummationOfPrimes.sumPrimes(2000000));

        //Largest product in a series
        System.out.println("Task 11, result = " + LargestProductGrid.findMaxProduct(4));

        //Largest product in a series
        System.out.println("Task 12, result = " + HighlyDivisible.findDivisbleValue(500));

        //Largest product in a series
        System.out.println("Task 13, result = " + LargeSum.sumOfDigits(10));

        //Largest product in a series
        System.out.println("Task 14, result = " + CollatzProblem.findLongestCollatzNumber(1000000));

        //Largest product in a series
        System.out.println("Task 15, result = " + LatticePath.allPossiblePaths(20));

        //Largest product in a series
        System.out.println("Task 16, result = " + PowerDigit.sum(2, 1000));

        //Largest product in a series
        System.out.println("Task 17, result = " + NumberLetter.letterCount(1000));

        //Max path sum I and II
        System.out.println("Task 18 / 67, result = " + TriangleMaxPath.calculate("additional_files/task18_triangle.txt"));

        //Sundays Counter
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date start = dateFormat.parse("01/01/1901");
            Date finish = dateFormat.parse("31/12/2000");
            System.out.println("Task 19, result = " + DayCounter.sundaysBetweenDates(start, finish));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Factorial digit sum
        System.out.println("Task 20, result = " + FactorialDigit.sum(100));

        //Amicable numbers
        System.out.println("Task 21, result = " + AmicableNumber.amicable(10000));

        //Names score
        System.out.println("Task 22, result = " + NameScore.allNamesTotal("additional_files/task22_names.txt"));

        //1000-digit Fibonacci number
        System.out.println("Task 25, result = " + FibonacciNumber.indexOf(1000));
    }

}
