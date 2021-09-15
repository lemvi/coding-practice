package at.lemvi.codingpractice.exercises.codewars.TakeATenMinuteWalk;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

class TenMinWalkTest {

    @Test
    void isValid() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','s','w','w','e','e','e'}));
    }
}