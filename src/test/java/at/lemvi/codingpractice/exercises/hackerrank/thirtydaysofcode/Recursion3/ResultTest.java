package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.Recursion3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @BeforeEach
    private void resetResult() {
        Result.setResult(0);
    }

    @CsvSource({
            "3, 6",
            "5, 120",
            "8, 40320"
    })
    @ParameterizedTest
    void factorial(int input, int expected) {
        int actual = Result.factorial(input);
        assertEquals(expected, actual);
    }
}