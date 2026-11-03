package Assignment_8.Question_3;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 8
Question: 3
*/

public class Main {
    public static void main(String[] args) {

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < m.length; i++) {
            int sum = 0;

            for (int j = 0; j < m[i].length; j++) {
                sum = sum + m[i][j];
            }

            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }
    }
}

