package at.lemvi.codingpractice.exercises.cyberdojo.anagrams;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Solution {

    private void swapLastTwoLetters(Set<String> resultSet, String input) {
        resultSet.add(input);
        resultSet.add(generateAnagram(input, input.length() - 2, input.length() - 1));
    }

    public Set<String> swapLastThreeCharactersAround(Set<String> resultSet, String input) {
        int inputLength = input.length();
        swapLastTwoLetters(resultSet, input);
        String alteredString = "";
        for (int i = inputLength - 1; i > 0; i--) {
            for (int j = inputLength - 2; j > 0; j--) {
                alteredString = generateAnagram(input, i, j);
                swapLastTwoLetters(resultSet, alteredString);
            }
        }
        return resultSet;
    }


    public Set<String> getSingleLine(Set<String> resultSet, String input, int swapPos1) {
        swapLastThreeCharactersAround(resultSet, input);
        int inputLength = input.length();

        for (int i = 1; i < inputLength; i++) {
            swapLastThreeCharactersAround(resultSet, generateAnagram(input, swapPos1, i));
        }

        return resultSet;
    }

    public String getAllLines(Set<String> resultSet, String input) {
        for (int i = 0; i < input.length(); i++) {
            getSingleLine(resultSet, input, i);
        }
        var secondSet = new TreeSet<String>();
        for (String s : resultSet) {
            getSingleLine(secondSet, s, 1);
        }
        resultSet.addAll(secondSet);
        return getString(resultSet);
    }

    private String getString(Set<String> resultSet) {
        String result = "";
        boolean isNewLine;
        String previous = " ";
        for (String anagram : resultSet) {
            isNewLine = anagram.charAt(0) != previous.charAt(0);
            if (isNewLine) {
                if (result.isEmpty())
                    result = anagram;
                else
                    result += "\n" + anagram;
            } else
                result += " " + anagram;
            previous = anagram;
        }
        return result;
    }


    public String generateAnagram(String input, int swapPos1, int swapPos2) {
        List<String> listOfSingleCharacterStrings = input.chars()
                                                         .mapToObj(value -> String.valueOf((char) value))
                                                         .collect(Collectors.toList());
        Collections.swap(listOfSingleCharacterStrings, swapPos1, swapPos2);
        return listOfSingleCharacterStrings.stream().collect(Collectors.joining());
    }
}
