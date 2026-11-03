package Assignment_13.Question_4;

/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 13
Question: 4
*/

public class Main {
    public static void main(String[] args) {

        String word = "abc";

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
}