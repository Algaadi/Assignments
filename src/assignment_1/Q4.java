package assignment_1;

/* Q4: Write a Java program to reverse an array */

public class Q4 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
