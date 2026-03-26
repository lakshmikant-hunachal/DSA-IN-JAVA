class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int a = curr.val;
            int b = curr.next.val;

            int gcd = findGCD(a, b);

            ListNode newNode = new ListNode(gcd);
            newNode.next = curr.next;
            curr.next = newNode;

            curr = newNode.next; // move to next original node
        }

        return head;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;  // ✔ correct
            a = b;
            b = temp;
        }
        return a;
    }
}