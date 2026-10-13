package Linked_List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Step 1: Create dummy node (helper)
        ListNode dummy = new ListNode(-1);

        // Step 2: Pointer to build result
        ListNode current = dummy;

        // Step 3: Traverse both lists
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;   // attach list1 node
                list1 = list1.next;     // move list1
            } else {
                current.next = list2;   // attach list2 node
                list2 = list2.next;     // move list2
            }

            current = current.next;     // move result pointer
        }

        // Step 4: Attach remaining list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Step 5: Return real head
        return dummy.next;
    }
}
