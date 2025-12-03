package assignment_1;

/* Q3: Write a program in Java to remove a specific element from an array */

public class Q3 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = Integer.MIN_VALUE;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
