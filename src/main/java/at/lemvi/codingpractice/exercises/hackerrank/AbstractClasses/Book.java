package at.lemvi.codingpractice.exercises.hackerrank.AbstractClasses;

public abstract class Book {
    String title;
    String author;
    int price;
    abstract void display();

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
