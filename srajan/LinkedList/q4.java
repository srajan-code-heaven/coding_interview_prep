//206. Reverse Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
       ListNode curr=head;
       ListNode next=null;
       while(curr!=null)
       {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
        return prev;
    }
}

// null-1 - 2 - 3

// curr=1
// next = 2
// 1 - null
// prev= 1
// curr=2
// next=3

// next= 3
// 2 - 1
// prev=2
// curr=3
// 2 - 1 - null
