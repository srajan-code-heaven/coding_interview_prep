/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //142. Linked List Cycle II
//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.


public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fastptr=head;
        ListNode slowptr=head;
        if(head==null || head.next==null)
        {
            return null;
        }
        while(fastptr!=null && fastptr.next!=null)
        {
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(slowptr==fastptr)
            {
                break;
            }
        }
        if(slowptr!=fastptr)
        {
            return null;
        }

        slowptr=head;
        while(slowptr!=fastptr)
        {
            fastptr=fastptr.next;
            slowptr=slowptr.next;
        }
        return slowptr;
    }
}


// A + B*K1 + C1 == A+ B*K2 +C2
//  B*K1 + C1 == B*K2 +C2
