package Assignment_7.Question_3;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 7
Question: 3
*/

public class Main {
    public static void main(String[] args) {

        int n = 1024;
        int steps = 0;

        // Time Complexity: O(log n) - Logarithmic Time

        while (n > 1) {
            n = n / 2;
            steps++;
        }

        System.out.println("Halving steps: " + steps);
    }
}

