package assignment_2;

/*
Q2: Implement a List using arrays with the following operations:
     - insertAtPosition(position, value)
     - deleteAtPosition(position)
     - display()
*/

public class Q2 {

    int[] arr = new int[100];
    int size = 0;

    public void insertAtPosition(int pos, int value) {

        if (pos < 0 || pos > size) return;

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;
        size++;
    }

    public void deleteAtPosition(int pos) {

        if (pos < 0 || pos >= size) return;

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Q2 list = new Q2();
        list.insertAtPosition(0, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(1, 15);
        list.display();
    }
}
