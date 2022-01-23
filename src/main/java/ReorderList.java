// 1-2-3-4-5 reorder to 1-5-2-4-3
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode l1 = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l2 = reverse(slow);

        merge(l1, l2);
    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;

            if (l1Next == null) {
                break;
            }

            l2.next = l1Next;
            l1 = l1Next;
            l2 = l2Next;
        }
    }


    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
