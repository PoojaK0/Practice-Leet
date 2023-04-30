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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int len=0;
        while(curr != null){
            len++;
            curr=curr.next;
        }
        if(len==n){
            return head.next;
        }

        int node=len-n;
        // System.out.println(node);
        curr=head;
        int i=1;
        while(i++ < node){
            curr=curr.next;
        }

        curr.next=curr.next.next;
        return head;

    }
}

