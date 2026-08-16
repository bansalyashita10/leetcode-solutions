/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node middle =new Node(x);
        if(head==null){
            return middle;
        }
        if(head.next==null){
            head.next=middle;
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        middle.next=slow.next;
        slow.next=middle;
       
        
        
        return head;
    }
}