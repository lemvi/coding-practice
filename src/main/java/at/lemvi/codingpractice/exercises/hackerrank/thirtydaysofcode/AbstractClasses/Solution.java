package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.AbstractClasses;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();

        MyBook myBook = new MyBook(title, author, price);
        myBook.display();
    }
}
