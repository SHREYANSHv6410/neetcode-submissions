class Solution {
    public void reorderList(ListNode head) {
        ListNode curr=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode curr2=second;
        ListNode prev=null;

        while(curr2!=null){
            ListNode next=curr2.next;
            curr2.next=prev;
            prev=curr2;
            curr2=next;
        }
        second=prev;
        ListNode first=head;
        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
        return;
    }
}