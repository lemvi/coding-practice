package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.Inheritance;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int idNumber = scanner.nextInt();
        List<Integer> intArrList = new ArrayList<>();
        scanner.nextLine();
        scanner.nextLine();
        while (scanner.hasNextInt()) {
            intArrList.add(scanner.nextInt());
        }
        int[] intArr = intArrList.stream().mapToInt(integer -> integer).toArray();
        Student student = new Student(firstName, lastName, idNumber, intArr);

        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
        System.out.println("Grade: " + student.calculate());
    }
}
