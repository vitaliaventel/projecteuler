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
        System.out.println("Task 16, result = " + PowerDigit.sum(2, 1000));

    }

}
