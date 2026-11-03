package Assignment_4.Question_3;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 4
Question: 3
*/

public class Main {

    static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Larger: " + maxOf(14, 9));
    }
}

