class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;

        ListNode current = head;
        int count = 1;

        while (current.next != null) {
            current = current.next;
            count++;
        }

        if (n == count)
            return head.next;

        ListNode prev = head;
        ListNode temp = prev.next;

        int steps = count - n - 1;

        while (steps-- > 0) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        temp.next = null;

        return head;
    }
}