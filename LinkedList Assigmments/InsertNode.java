/*Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.
Input : LL = 1 -> 2 -> 4 -> 5 -> 6 pointer = 2 value = 3.
Output : 1 -> 2 -> 3 -> 4 -> 5 -> 6
*/
public class InsertNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Add a new data to the end of the linked list
    public static void Add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert a new node after the given index
    public static void Add(int index, int data) {
        if (index <= 0) {
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            return; // Index out of bounds
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        InsertNode list = new InsertNode();
        list.Add(10);
        list.Add(20);
        list.Add(30);
        list.Add(40);
        list.Add(50);
        System.out.println("Before Adding the new Data in LinkedList");
        list.print();
        System.out.println("After Adding the new Data in LinkedList");
        list.Add(4, 9);
        list.print();
    }
}
