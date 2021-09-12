package at.lemvi.codingpractice.DuplicateEncoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    public static String encode(String word){
        Map<String, Long> countMap = word
                .chars()
                .mapToObj(value -> String.valueOf(Character.valueOf((char)value)))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        List<String> singles = countMap
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue()==1)
                .map(stringLongEntry -> stringLongEntry.getKey())
                .collect(Collectors.toList());
        String result = word
                .chars()
                .mapToObj(value -> String.valueOf(Character.valueOf((char)value)))
                .map(String::toLowerCase)
                .map(s -> singles.contains(s)?"(":")")
                .collect(Collectors.joining());
        System.out.println("word: \"" + word + "\" | " + countMap + " | " + result);
        return result;
    }
}
