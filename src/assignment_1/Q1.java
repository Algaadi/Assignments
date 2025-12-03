package assignment_1;

/* Q1: Write a program to clone an array */

public class Q1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] clone = arr.clone();

        for (int x : clone) {
            System.out.print(x + " ");
        }
    }
}
