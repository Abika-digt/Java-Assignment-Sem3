package Assignment_9.Question_1;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 9
Question: 1
*/

public class Main {
    public static void main(String[] args) {

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[0][j] + " ");
        }

        System.out.println();

        System.out.print("Last row: ");
        for (int j = 0; j < m[m.length - 1].length; j++) {
            System.out.print(m[m.length - 1][j] + " ");
        }

        System.out.println();
    }
}

