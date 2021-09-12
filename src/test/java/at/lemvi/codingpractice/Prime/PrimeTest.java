package at.lemvi.codingpractice.Prime;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertFalse;
import static org.springframework.test.util.AssertionErrors.assertTrue;

public class PrimeTest {

    @Test
    public void testBasic() {
        assertFalse("0  is not prime", Prime.isPrime(0));
        assertFalse("1  is not prime", Prime.isPrime(1));
        assertTrue ("2  is prime",     Prime.isPrime(2));
        assertTrue ("73 is prime",     Prime.isPrime(73));
        assertFalse("75 is not prime", Prime.isPrime(75));
        assertFalse("-1 is not prime", Prime.isPrime(-1));
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", Prime.isPrime(3));
        assertTrue("5 is prime", Prime.isPrime(5));
        assertTrue("7 is prime", Prime.isPrime(7));
        assertTrue("41 is prime", Prime.isPrime(41));
        assertTrue("5099 is prime", Prime.isPrime(5099));
        assertTrue("2946901 is prime", Prime.isPrime(2946901));
        assertTrue("3411949 is prime", Prime.isPrime(3411949));
        assertTrue("43112609 is prime", Prime.isPrime( 43112609));
        assertTrue("777767777 is prime", Prime.isPrime( 777767777));
    }

    @Test
    public void testNotPrime() {
        assertFalse("4 is not prime", Prime.isPrime(4));
        assertFalse("6 is not prime", Prime.isPrime(6));
        assertFalse("8 is not prime", Prime.isPrime(8));
        assertFalse("9 is not prime", Prime.isPrime(9));
        assertFalse("45 is not prime", Prime.isPrime(45));
        assertFalse("-5 is not prime", Prime.isPrime(-5));
        assertFalse("-8 is not prime", Prime.isPrime(-8));
        assertFalse("-41 is not prime", Prime.isPrime(-41));
        assertFalse("1489419649 is not prime", Prime.isPrime(1489419649));
        assertFalse("1872545533 is not prime", Prime.isPrime(1872545533));
    }
}