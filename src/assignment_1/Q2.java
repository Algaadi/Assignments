package assignment_1;

/* Q2: Write a program in Java to remove a random element from an array */

import java.util.Random;

public class Q2 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Random rand = new Random();

        int randomIndex = rand.nextInt(arr.length);

        for (int i = randomIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = Integer.MIN_VALUE;

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
