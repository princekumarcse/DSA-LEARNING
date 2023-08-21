/*Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
Examples:
14->21->11->30->10, X = 14
Yes
Explanation: 14 is present in the linked list.
6->21->17->30->10->8, X = 13
No*/

public class FindKey{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public void append(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node current =head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();

        if(head==null){
            System.out.println("Linked List is Null");
            return ;
        }
    }

    public int SearchKey(int key){
        Node current=head;
        int index=0;
        while(current!=null){
            if(current.data==key){
                return index;
            }
            current=current.next;
            index++;
        }
        return -1;
    }

    public static void main(String args[]){
        FindKey list=new FindKey();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        int key=60;
        int result=list.SearchKey(key);
        list.print();
        if(result!=-1){
            System.out.println("Key Found at: "+result);
        }else{
            System.out.println("Key not Found");
        }

    }
}