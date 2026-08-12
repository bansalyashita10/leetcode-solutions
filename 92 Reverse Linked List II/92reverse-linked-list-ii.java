class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;

        ListNode prev = null;
        ListNode current = head;

        for (int i = 1; i < left; i++) {
            prev = current;
            current = current.next;
        }

        ListNode before = prev;
        ListNode tail = current;

        for (int i = left; i <= right; i++) {
            ListNode Next = current.next;

            current.next = prev;
            prev = current;
            current = Next;
        }
        
        if (before != null)
            before.next = prev;
        else
            head = prev;

        tail.next = current;

        return head;
    }
}