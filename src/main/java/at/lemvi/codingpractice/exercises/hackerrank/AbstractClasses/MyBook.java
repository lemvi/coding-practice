package at.lemvi.codingpractice.exercises.hackerrank.AbstractClasses;

public class MyBook extends Book{

    public MyBook(String title, String author, int price) {
        super(title, author, price);
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }
}
