package at.lemvi.codingpractice.exercises.codewars.CountingDuplicates;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<String, Long> countMap = text
                .chars()
                .mapToObj(value -> String.valueOf(Character.valueOf((char) value)))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        return (int)(countMap
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue()>1)
                .count());
    }
}