// Problem: Remove Nth Node From End of List
//link:https:https://leetcode.com/submissions/detail/1968515278/
// Platform:leetnode
// Difficulty: medium
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode fast=temp;
        ListNode slow=temp;
        
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }slow.next=slow.next.next;return temp.next;
    }
}
