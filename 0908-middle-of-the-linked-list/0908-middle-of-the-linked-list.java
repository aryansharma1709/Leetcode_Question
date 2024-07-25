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
    public ListNode middleNode(ListNode head) {
        // ListNode temp=head;
        int n= length(head);
        n=n/2 +1;
        int c=1;
        while(c!=n)
        {
            head=head.next;
            c++;
        }
        return head;
    }
    public int length(ListNode head)
    {
        int c=1;
        while(head.next!=null)
        {
            c++;
            head=head.next;
        }
        System.out.println(c);
        return c;
    }
}