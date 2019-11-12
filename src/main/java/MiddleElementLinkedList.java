public class MiddleElementLinkedList {
    public static void main(String[] args) {
        ListNode nodeOne = new ListNode(1);
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFive = new ListNode(5);
        ListNode nodeSeven = new ListNode(7);
        ListNode nodeNine = new ListNode(9);
        nodeOne.next = nodeThree;
        nodeThree.next = nodeFive;
        nodeFive.next = nodeSeven;
        nodeSeven.next = nodeNine;

        System.out.println(midEle(nodeOne).val);
    }

    public static ListNode midEle(ListNode head){

        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}
