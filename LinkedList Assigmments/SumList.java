/*Q5. Given two numbers represented by two lists, write a function that returns the sum list. The
sum list is a list representation of the addition of two input numbers.
Example:
List1: 5->6->3
List2: 8->4->2
Resultant list: 1->4->0->5
Explanation: 563 + 842 = 1405
List1: 7->5->9->4->6
List2: 8->4
Resultant list: 7->6->0->3->0
Explanation: 75946+84=76030
*/



public class SumList {

    public static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        
        if (carry > 0) {
            current.next = new Node(carry);
        }
        
        return dummyHead.next;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
         SumList solution = new  SumList();

        // Create two numbers as linked lists: 2 -> 4 -> 3 and 5 -> 6 -> 4
        Node l1 = new Node(5);
        l1.next = new Node(6);
        l1.next.next = new Node(3);

        Node l2 = new Node(8);
        l2.next = new Node(4);
        l2.next.next = new Node(2);

        Node sumList = solution.addTwoNumbers(l1, l2);

        System.out.println("Sum List:");
        printList(sumList);
    }
}
