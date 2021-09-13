package at.lemvi.codingpractice.exercises.codewars.Persist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistTest {

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }

    @Test
    public void multiplyDigits() {
        assertEquals(27, Persist.multiplyDigits(39));
        assertEquals(54, Persist.multiplyDigits(392));
    }

    @Test
    public void singleDigit() {
        assertEquals(false, Persist.isSingleDigit(23));
        assertEquals(true, Persist.isSingleDigit(2));
    }

}
