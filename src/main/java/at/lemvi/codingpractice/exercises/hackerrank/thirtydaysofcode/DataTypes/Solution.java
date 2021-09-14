package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.DataTypes;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int number;
        double decimal;
        String string;

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        decimal = scanner.nextDouble();
        scanner.nextLine();
        string = scanner.nextLine();
        System.out.println(number + i);
        System.out.println(decimal + d);
        System.out.println(s + string);
    }
}