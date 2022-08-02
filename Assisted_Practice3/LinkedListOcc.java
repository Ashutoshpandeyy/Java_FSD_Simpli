
class LinkedListOcc {
    static Node head; // head of list

    /* Linked list Node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /*
     * Given a key, deletes all occurrence
     * of the given key in linked list
     */
    void deleteKey(int key) {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key
        // or multiple occurrences of key
        while (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            temp = head; // Change Temp
        }

        // Delete occurrences other than head
        while (temp != null) {
            // Search for the key to be deleted,
            // keep track of the previous node
            // as we need to change 'prev->next'
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            // If key was not present in linked list
            if (temp == null)
                return;

            // Unlink the node from linked list
            prev.next = temp.next;

            // Update Temp for next iteration of outer loop
            temp = prev.next;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /*
     * This function prints contents of linked list
     * starting from the given node
     */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        LinkedListOcc llist = new LinkedListOcc();

        llist.push(7);
        llist.push(2);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        llist.push(1);
        llist.push(2);
        llist.push(2);

        int key = 2; // key to delete

        System.out.println("Created Linked list is:");
        llist.printList();

        // Function call
        llist.deleteKey(key);

        System.out.println(
                "\nLinked List after Deletion is:");
        llist.printList();
    }
}












// import java.io.*;
// import java.util.*;

// public class LinkedListOcc {
// public static class Node {
// int data;
// Node next;
// }

// public static class LinkedList {
// Node head;
// Node tail;
// int size;

// void addLast(int val) {
// Node temp = new Node();
// temp.data = val;
// temp.next = null;

// if (size == 0) {
// head = tail = temp;
// } else {
// tail.next = temp;
// tail = temp;
// }

// size++;
// }

// public int size() {
// return size;
// }

// public void display() {
// for (Node temp = head; temp != null; temp = temp.next) {
// System.out.print(temp.data + " ");
// }
// System.out.println();
// }

// public void removeFirst() {
// // write your code here
// if (this.size == 0) {
// System.out.println("List is empty");
// } else if (this.size == 1) {
// this.head = this.tail = null;
// this.size = 0;
// } else {
// Node nbr = this.head.next;
// this.head = nbr;
// this.size--;

// }

// }
// }

// public static void main(String[] args) throws Exception {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// LinkedList list = new LinkedList();

// String str = br.readLine();
// while (str.equals("quit") == false) {
// if (str.startsWith("addLast")) {
// int val = Integer.parseInt(str.split(" ")[1]);
// list.addLast(val);
// } else if (str.startsWith("size")) {
// System.out.println(list.size());
// } else if (str.startsWith("display")) {
// list.display();
// } else if (str.startsWith("removeFirst")) {
// list.removeFirst();
// }
// str = br.readLine();
// }
// }
// }
