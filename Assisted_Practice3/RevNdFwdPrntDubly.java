
class RevNdFwdPrntDubly {

    // Doubly linked list node
    static class Node {
        int data;
        Node next;
        Node prev;
    };

    // Function to print nodes of Doubly
    // Linked List in Forward Direction
    static void fwdPrint(Node head) {
        
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }

    // Function to print nodes of Doubly
    // Linked List in reverse order
    static void reversePrint(Node head_ref) {
        Node tail = head_ref;

        // Traversing till tail of the linked list
        while (tail.next != null) {
            tail = tail.next;
        }

        // Traversing linked list from tail
        // and printing the node.data
        while (tail != head_ref) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
        System.out.println(tail.data);
    }

    // UTILITY FUNCTIONS /
    // Function to insert a node at the
    // beginning of the Doubly Linked List
    static Node push(Node head_ref, int new_data) {
        // allocate node
        Node new_node = new Node();

        // put in the data
        new_node.data = new_data;

        // since we are adding at the beginning,
        // prev is always null
        new_node.prev = null;

        // link the old list off the new node
        new_node.next = (head_ref);

        // change prev of head node to new node
        if ((head_ref) != null)
            (head_ref).prev = new_node;

        // move the head to point to the new node
        (head_ref) = new_node;
        return head_ref;
    }

    // Driver Code
    public static void main(String args[]) {
        // Start with the empty list
        Node head = null;

        // Let us create a sorted linked list
        // to test the functions
        // Created linked list will be 10.8.4.2
        head = push(head, 2);
        head = push(head, 4);
        head = push(head, 8);
        head = push(head, 10);

        System.out.println("Linked List elements in reverse order :\n ");
        reversePrint(head);

        System.out.println();
        System.out.println("Traversing in Forward direction\n ");
        fwdPrint(head);
    }
}