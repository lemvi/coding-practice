package at.lemvi.codingpractice.exercises.codewars.DuplicateEncoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
        //assertEquals("(([(](",DuplicateEncoder.encode("123[4]5"));
    }
}