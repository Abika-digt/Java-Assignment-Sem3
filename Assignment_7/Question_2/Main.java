package Assignment_7.Question_2;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 7
Question: 2
*/

public class Main {
    public static void main(String[] args) {

        int steps = 0;

        // Time Complexity: O(n^2) - Quadratic Time

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }

        System.out.println("Steps: " + steps);
    }
}

