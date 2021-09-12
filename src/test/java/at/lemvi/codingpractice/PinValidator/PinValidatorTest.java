package at.lemvi.codingpractice.PinValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinValidatorTest {
    @Test
    public void validPins() {
        assertEquals(true, PinValidator.validatePin("1234"));
        assertEquals(true, PinValidator.validatePin("0000"));
        assertEquals(true, PinValidator.validatePin("1111"));
        assertEquals(true, PinValidator.validatePin("123456"));
        assertEquals(true, PinValidator.validatePin("098765"));
        assertEquals(true, PinValidator.validatePin("000000"));
        assertEquals(true, PinValidator.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, PinValidator.validatePin("a234"));
        assertEquals(false, PinValidator.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, PinValidator.validatePin("1"));
        assertEquals(false, PinValidator.validatePin("12"));
        assertEquals(false, PinValidator.validatePin("123"));
        assertEquals(false, PinValidator.validatePin("12345"));
        assertEquals(false, PinValidator.validatePin("1234567"));
        assertEquals(false, PinValidator.validatePin("-1234"));
        assertEquals(false, PinValidator.validatePin("1.234"));
        assertEquals(false, PinValidator.validatePin("00000000"));
        assertEquals(false, PinValidator.validatePin("000000000000000"));
    }
}
