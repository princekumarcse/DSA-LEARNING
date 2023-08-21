/*Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
Example 1:head = [1,2,2,1]
true
Example 2:
head = [1,2]
false
*/
public class CheckPalindrome {
    public static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; //if head and tail are empty
        }
        
        Node slow = head;
        Node fast = head;
        
        // Find the middle of the linked list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse the second half of the linked list
        Node secondHalf = reverseList(slow.next);
        
        // Compare the reversed second half with the first half
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }
    
    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        CheckPalindrome solution = new CheckPalindrome();

        // Create a palindrome linked list: 1 -> 2  -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next= new Node(1);

        System.out.println("IS Linkedlist is Palindrome? " + solution.isPalindrome(head));
    }
}
