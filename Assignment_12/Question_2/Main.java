package Assignment_12.Question_2;

/*
Name: Your Name
Roll Number: Your Roll Number
Assignment: 12
Question: 2
*/

public class Main {
    public static void main(String[] args) {

        int[] arr = {14, 3, 9, 21, 6};

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.print("Sorted: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}

