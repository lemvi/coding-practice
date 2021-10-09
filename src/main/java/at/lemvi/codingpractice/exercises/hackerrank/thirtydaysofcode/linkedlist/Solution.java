package at.lemvi.codingpractice.exercises.hackerrank.thirtydaysofcode.linkedlist;

import java.util.Scanner;

/*
Link to exercise:
https://www.hackerrank.com/challenges/30-linked-list/problem
 */

public class Solution {
    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node insertNode = new Node(data);
        Node start;
        start = head;
        while (start.next != null) {
            start = start.next;
        }
        start.next = insertNode;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
