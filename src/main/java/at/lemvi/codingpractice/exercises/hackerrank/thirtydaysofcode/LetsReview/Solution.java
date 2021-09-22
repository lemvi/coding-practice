package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.LetsReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-review-loop/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        while (scanner.hasNext()) {
            List<Character> result1 = new ArrayList<>();
            List<Character> result2 = new ArrayList<>();
            String s = scanner.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char[] charArray = s.toCharArray();
                if (i%2 == 0)
                    result1.add(charArray[i]);
                else
                    result2.add(charArray[i]);
            }
            System.out.println(makeStringOfCharacterList(result1) + " " + makeStringOfCharacterList(result2));
        }
    }

    private static String makeStringOfCharacterList(List<Character> characterList) {
        return characterList.stream()
                            .map(character -> character.toString())
                            .reduce((s, s2) -> s + s2).orElse("error");
    }

}
