class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        // Step 1: Count total nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        // Step 2: Find size of each part
        int size = count / k;
        int extra = count % k;

        // Step 3: Split the list
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            if (curr == null) {
                ans[i] = null;
                continue;
            }

            ans[i] = curr;

            int currSize = size + (extra > 0 ? 1 : 0);
            extra--;

            // Move to end of this part
            for (int j = 1; j < currSize; j++) {
                curr = curr.next;
            }

            // Break the list
            ListNode nextPart = curr.next;
            curr.next = null;
            curr = nextPart;
        }

        return ans;
    }
}