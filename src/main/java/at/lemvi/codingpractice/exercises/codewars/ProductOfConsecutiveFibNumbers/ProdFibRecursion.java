package at.lemvi.codingpractice.exercises.codewars.ProductOfConsecutiveFibNumbers;

import java.util.ArrayList;
import java.util.List;

public class ProdFibRecursion {
    public static long[] productFib(long prod) {
        int iterations = 70;
        List<Long> fibNums = getFibonacciNumbersList(iterations);
        long[] result = new long[3];

        for (int n = 0; n < iterations-1; n++) {
            long n1 = fibNums.get(n);
            long n2 = fibNums.get(n+1);
            long tempProd = Math.multiplyExact(n1, n2);
            if (tempProd == prod) {
                result[0] = n1;
                result[1] = n2;
                result[2] = 1;
                break;
            }
            if (tempProd > prod) {
                result[0] = n1;
                result[1] = n2;
                result[2] = 0;
                break;
            }
        }

        return result;
    }

    private static List<Long> getFibonacciNumbersList(int iterations) {
        List<Long> fibNums = new ArrayList<>();
        fibNums.add(0l);
        fibNums.add(1l);
        return generateFibNumbers(fibNums, iterations);
    }

    private static List<Long> generateFibNumbers(List<Long> fibNums, int iterations) {
        long num = fibNums.get(fibNums.size()-1);
        long num2 = fibNums.get(fibNums.size()-2);

        fibNums.add(Long.sum(num, num2));
        iterations--;
        if (iterations == 0) {
            return fibNums;
        }
        return generateFibNumbers(fibNums, iterations);
    }
}
