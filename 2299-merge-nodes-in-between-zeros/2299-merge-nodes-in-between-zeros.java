public class Solution {

    public ListNode mergeNodes(ListNode head) {
       ListNode m=head.next;
       ListNode temp=m;
       int sum=0;
       while(temp!=null)
       {
         if(temp.val==0)
         {
            m.val=sum;
            m.next=temp.next;
            m=m.next;
            sum=0;
             
         }
         sum+=temp.val;
         temp=temp.next;
       }
       return head.next;
    }
}

         