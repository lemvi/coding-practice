package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.Inheritance;

import java.util.Arrays;

public class Student extends Person{
    private int[] scores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }

    public char calculate() {
        int avgScore = (int) Math.floor(Arrays.stream(scores).average().getAsDouble());
        System.out.println(avgScore);
        if (avgScore >= 90) {
            return 'O';
        } else if (avgScore >= 80) {
            return 'E';
        } else if (avgScore >= 70) {
            return 'A';
        } else if (avgScore >= 55) {
            return 'P';
        } else if (avgScore >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}
