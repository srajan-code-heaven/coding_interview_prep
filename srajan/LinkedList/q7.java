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
 //61. Rotate List
//Given the head of a linked list, rotate the list to the right by k places.


class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
        ListNode curr=head;
        int n=1;
        while(curr.next!=null)
        {
            n++;
            curr=curr.next;
        }
        k=k%n;
        if(k==0)
        {
            return head;
        }
        curr.next=head;
        curr=head;
        int beg=n-k;
        while(beg!=1)
        {
            curr=curr.next;
            beg--;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
}
