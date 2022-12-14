/*
    The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385

    The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 55^2 = 3025

    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is.
    3015 - 385 = 2640

    Find the difference between the sum of the squares of the first
    one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {
    public static void main(String[] args) {
        int n = 100;

        long sum1 = ((2 * n) + 1) * (n + 1) * n / 6;

        long sum2 = n * (n + 1) / 2;
        sum2 *= sum2;

        System.out.println(sum2 - sum1);
    }
}
