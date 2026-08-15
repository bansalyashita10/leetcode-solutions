/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
       int count=0;
       Node temp=head;
       while(temp!=null){
           temp=temp.next;
           count++;
       }
       
       int steps=count-k;
       
       if(k > count){
           return -1;
       }
       Node current=head;
       while(steps-->0){
           current=current.next;
       }
        return current.data;
    }
}