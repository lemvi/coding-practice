package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.ConditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n%2 != 0 || 6 <= n && n <= 20)
            System.out.println("Weird");
        else if (2 <= n && n <= 5 || 20 < n)
            System.out.println("Not Weird");

        bufferedReader.close();
    }
}