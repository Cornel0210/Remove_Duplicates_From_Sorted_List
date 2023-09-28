package check;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * Ex:  Input: head = [1,1,2]
 *      Output: [1,2]
 *
 *      Ex:  Input: head = [1,1,2,3,3]
 *  *      Output: [1,2,3]
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode newHead = new ListNode(head.val);
        ListNode tempNode = newHead;


        while (head.next != null){
            if (head.next.val != tempNode.val){
                tempNode.next = new ListNode(head.next.val);
                tempNode = tempNode.next;
            }
            head = head.next;
        }
        return newHead;
    }
}
