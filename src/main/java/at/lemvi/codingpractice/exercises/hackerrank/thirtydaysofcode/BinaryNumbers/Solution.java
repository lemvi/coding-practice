package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.BinaryNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String value = Integer.toBinaryString(n);
        var arr = value.toCharArray();
        List<Integer> listOfCounters = new ArrayList<>();
        int counter = 0;
        for (char c : arr) {
            if (c == '1')
                counter++;
            if (c == '0') {
                listOfCounters.add(counter);
                counter = 0;
            }
        }
        listOfCounters.add(counter);
        var result = Collections.max(listOfCounters);
        System.out.println(result);

        bufferedReader.close();
    }
}