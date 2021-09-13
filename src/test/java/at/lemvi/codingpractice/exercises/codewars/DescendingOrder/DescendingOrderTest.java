package at.lemvi.codingpractice.exercises.codewars.DescendingOrder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    public void numberToStringWithZero() {
        assertEquals("0",DescendingOrder.numberToString(0), "Expected input number (0) as a String");
    }

    @Test
    public void numberToString() {
        assertEquals("1523", DescendingOrder.numberToString(1523), "Expected input number (1523) as a String");
    }

    @Test
    public void makeArrayOutOfString() {
        assertEquals( "12", DescendingOrder.intArrayViewer(DescendingOrder.stringToArray("12")), "Expected to get an Array for each character of a String");
    }

    @Test
    public void returnElementsOfIntArray() {
        assertEquals("12", DescendingOrder.intArrayViewer(Arrays.asList(1,2)), "Expected String of contents of char array");
    }

    @Test
    public void sortArrayDescending() {
        assertEquals("21", DescendingOrder.intArrayViewer(DescendingOrder.sortArrayDesc(Arrays.asList(1,2))), "Expecting a sorted Array in a descending order");
    }
}