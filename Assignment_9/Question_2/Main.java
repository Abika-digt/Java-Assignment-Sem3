package Assignment_9.Question_2;

/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 9
Question: 2
*/

public class Main {
    public static void main(String[] args) {

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < m[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < m.length; i++) {
                sum = sum + m[i][j];
            }

            System.out.println("Column " + (j + 1) + " sum: " + sum);
        }
    }
}

