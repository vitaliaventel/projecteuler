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

        //Largest polindrome product
        System.out.println("Task 4, result = " + LargestPalindromeProduct.findPalindrome());

        //Sum square difference
        System.out.println("Task 6, result = " + SumSquareDifference.difference(100));

    }

}
