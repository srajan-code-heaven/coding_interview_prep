//82. Remove Duplicates from Sorted List II
//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.


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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        boolean dupflg=false;

        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            dupflg=false;
            while(curr.next!=null && curr.val==curr.next.val)
            {
               curr=curr.next;
               dupflg=true;
            }
            if(dupflg)
            {
                if(prev==null)
                {
                    head=curr.next;
                }
                else
                {
                   prev.next=curr.next;
                }
            }
            else
            {
               prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}


// 1==2 false prev=1, curr=2
// 2==3 false prev=2 curr=3
// 3==3 true curr=3 3==4 false prev=2!=null 2.next=4  prev dont change
