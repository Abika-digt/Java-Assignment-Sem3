package Assignment_13.Question_2;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 13
Question: 2
*/

public class Main {
    public static void main(String[] args) {

        String word = "Java";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}

