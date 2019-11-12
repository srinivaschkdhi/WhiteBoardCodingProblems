import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger firstNumber = extractReverseOfNumberLinkedList(l1);
        BigInteger secondNumber = extractReverseOfNumberLinkedList(l2);
        BigInteger sum = firstNumber.add(secondNumber);
        return buildLinkedList(sum);
    }

    private ListNode buildLinkedList(BigInteger sum) {
        if (sum.equals(BigInteger.valueOf(0))) return new ListNode(0);

        ListNode startNode = null;
        ListNode currentNode = null;

        while (sum.compareTo(BigInteger.valueOf(0)) > 0) {
            int digit = sum.mod(BigInteger.valueOf(10)).intValue();
            sum = sum.divide(BigInteger.valueOf(10));
            ListNode node = new ListNode(digit);
            if (startNode == null) {
                startNode = node;
                currentNode = startNode;
            } else {
                currentNode.next = node;
                currentNode = node;
            }
        }

        return startNode;

    }

    private BigInteger extractReverseOfNumberLinkedList(ListNode listNode) {
        BigInteger result = BigInteger.valueOf(0);
        BigInteger multiple = BigInteger.valueOf(1);
        while (listNode != null) {
            BigInteger currNodeValue = BigInteger.valueOf(listNode.val);
            BigInteger currNodeValueMul = multiple.multiply(currNodeValue);
            result = result.add(currNodeValueMul);
            multiple = multiple.multiply(BigInteger.valueOf(10));
            listNode = listNode.next;
        }
        return result;
    }

    public ListNode addTwoNumb(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
