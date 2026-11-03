package Assignment_10.Question_3;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 10
Question: 3
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.set(1, 25);
        list.remove(3);

        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}

