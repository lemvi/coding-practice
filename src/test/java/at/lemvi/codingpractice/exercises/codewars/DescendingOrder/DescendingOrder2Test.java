package at.lemvi.codingpractice.exercises.codewars.DescendingOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrder2Test {
    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder2.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder2.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder2.sortDesc(123456789));
    }
}
