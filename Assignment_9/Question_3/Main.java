package Assignment_9.Question_3;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 9
Question: 3
*/

public class Main {
    public static void main(String[] args) {

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int count = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > 5) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than 5: " + count);
    }
}

