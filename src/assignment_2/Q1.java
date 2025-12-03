package assignment_2;

/*
Q1: Create an ADT (Abstract Data Type) for a List that supports the following operations:
     - insert(element)
     - remove(element)
     - search(element)
     - display()
*/

public class Q1 {

    int[] arr = new int[100];
    int size = 0;

    public void insert(int value) {
        arr[size++] = value;
    }

    public void remove(int value) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Q1 list = new Q1();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
