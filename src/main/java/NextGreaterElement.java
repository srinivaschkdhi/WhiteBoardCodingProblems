import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();//num and its next greater element as value
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            // if this num is greater element to elements in stack
            // pop the element form stack and entry in hashmap [8,7,6,5,10] 10 is next greater to 5,6,7,8
            while (!stack.isEmpty() && num > stack.peek()) {
                hashMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = hashMap.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
