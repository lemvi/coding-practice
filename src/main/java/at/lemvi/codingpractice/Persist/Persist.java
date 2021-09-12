package at.lemvi.codingpractice.Persist;

import java.util.Optional;
import java.util.OptionalInt;

public class Persist {
    public static int persistence(long n) {
        // your code
        long value = n;
        int result = 0;
        while(!isSingleDigit(value)) {
            value = multiplyDigits(value);
            result++;
        }
        return result;

    }

    public static int multiplyDigits(long n) {
        return String.valueOf(n)
                .chars()
                .map(i -> Character.getNumericValue(i))
                .reduce(Math::multiplyExact)
                .orElseThrow();
    }

    public static boolean isSingleDigit(long l) {
        return String.valueOf(l).chars().count() == 1;
    }
}
