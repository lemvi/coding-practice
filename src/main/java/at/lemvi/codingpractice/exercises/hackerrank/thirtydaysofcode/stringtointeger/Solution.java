package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.stringtointeger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 */


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        parseInteger(S);

        bufferedReader.close();
    }

    private static void parseInteger(String S) {
        try {
            System.out.println(Integer.parseInt(S));
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
