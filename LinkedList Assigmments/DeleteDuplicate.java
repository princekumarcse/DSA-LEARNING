/*Q3. Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well.
Input: head = [1,1,2]
Output: [1,2]
*/
public class DeleteDuplicate {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

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

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to remove duplicates from the linked list
    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next distinct element
            }
        }
    }

    public static void main(String args[]) {
        DeleteDuplicate list = new DeleteDuplicate();
        list.Add(1);
        list.Add(1);
        list.Add(2);

        System.out.println("Before Removing Duplicates:");
        list.print();

        list.removeDuplicates();

        System.out.println("After Removing Duplicates:");
        list.print();
    }
}
