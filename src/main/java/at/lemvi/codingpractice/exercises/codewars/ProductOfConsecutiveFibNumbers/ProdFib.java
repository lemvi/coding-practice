package at.lemvi.codingpractice.exercises.codewars.ProductOfConsecutiveFibNumbers;

public class ProdFib {

    public static long[] productFib(long prod) {
        long n1 = 0l;
        long n2 = 1l;
        while (n1 * n2 < prod) {
            long temp = n1;
            n1 = n2;
            n2 += temp;
        }
        return new long[]{n1, n2, n1 * n2 == prod ? 1 : 0};
    }
}
