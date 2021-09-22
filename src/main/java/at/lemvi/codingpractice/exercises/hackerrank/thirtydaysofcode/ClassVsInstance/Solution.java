package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.ClassVsInstance;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            Person person = new Person(input);
            person.amIOld();
            for(int i = 0; i < 3; i++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
    }
}