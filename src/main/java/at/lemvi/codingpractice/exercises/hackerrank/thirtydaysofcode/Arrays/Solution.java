package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-arrays/problem
 */


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                  .map(Integer::parseInt)
                                  .collect(toList());

        Collections.reverse(arr);

        System.out.println(arr.stream()
                              .map(integer -> String.valueOf(integer))
                              .reduce((integer, integer2) -> integer + " " + integer2)
                              .orElse("error"));

        bufferedReader.close();
    }
}