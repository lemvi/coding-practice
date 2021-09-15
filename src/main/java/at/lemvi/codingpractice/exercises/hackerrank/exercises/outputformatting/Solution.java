package at.lemvi.codingpractice.exercises.hackerrank.exercises.outputformatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.next();
        int int1 = scanner.nextInt();
        String string2 = scanner.next();
        int int2 = scanner.nextInt();
        String string3 = scanner.next();
        int int3 = scanner.nextInt();
        String bar = "================================";
        String lineBreak = "\n";

        System.out.println(
                bar + lineBreak +
                defineSpaceForString(string1) + transformToThreeDigits(int1) + lineBreak +
                defineSpaceForString(string2) + transformToThreeDigits(int2) + lineBreak +
                defineSpaceForString(string3) + transformToThreeDigits(int3) + lineBreak +
                bar
        );
    }

    private static String transformToThreeDigits(int i) {
        if (i < 10) {
            return "00" + i;
        }
        if (i < 100) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    private static String defineSpaceForString(String string) {
        int stringLength = string.length();
        int numberOfSpaces = 15 - stringLength;
        for (int i = 0; i < numberOfSpaces; i++) {
            string = string + " ";
        }
        return string;
    }
}
