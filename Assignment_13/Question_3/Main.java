package Assignment_13.Question_3;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 13
Question: 3
*/

public class Main {
    public static void main(String[] args) {

        String word = "racecar";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}

