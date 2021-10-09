package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.scope;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-scope
 */

public class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        List<Integer> intArrList = Arrays.stream(elements).mapToObj(value -> value).collect(Collectors.toList());
        int min = Collections.min(intArrList);
        int max = Collections.max(intArrList);
        int result = Math.abs(max) - Math.abs(min);
        this.maximumDifference = result;
    }

}
