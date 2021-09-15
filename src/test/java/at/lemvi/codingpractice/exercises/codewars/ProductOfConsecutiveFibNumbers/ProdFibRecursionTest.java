package at.lemvi.codingpractice.exercises.codewars.ProductOfConsecutiveFibNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdFibRecursionTest {

    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, ProdFibRecursion.productFib(4895));
    }
    @Test
    public void test2() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, ProdFibRecursion.productFib(5895));
    }
    @Test
    public void test3() {
        long[] r = new long[] {0, 1, 1};
        assertArrayEquals(r, ProdFibRecursion.productFib(0));
    }
    @Test
    public void test4() {
        long[] r = new long[] {1836311903, 2971215073l, 1};
        assertArrayEquals(r, ProdFibRecursion.productFib(5456077604922913919l));
    }

}