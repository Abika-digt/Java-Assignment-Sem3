package Assignment_14.Question_2;


/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 14
Question: 2
*/

public class Main {
    public static void main(String[] args) {

        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}
