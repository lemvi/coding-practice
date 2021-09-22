package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.DictionariesAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < numberOfInputs; i++) {
            String line = scanner.nextLine();
            var splitLine = line.split(" ");
            phoneBook.put(splitLine[0], Integer.valueOf(splitLine[1]));
        }
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String result;
            if(phoneBook.containsKey(input))
                result = input + "=" + phoneBook.get(input);
            else
                result = "Not found";
            System.out.println(result);
        }
    }
}
