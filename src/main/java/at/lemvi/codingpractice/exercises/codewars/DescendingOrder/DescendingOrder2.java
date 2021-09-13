package at.lemvi.codingpractice.exercises.codewars.DescendingOrder;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder2 {
    public static int sortDesc(final int num) {
            return Integer.parseInt(String.valueOf(num)
                                          .chars()
                                          .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                          .sorted(Comparator.reverseOrder())
                                          .collect(Collectors.joining()));
    }
}
