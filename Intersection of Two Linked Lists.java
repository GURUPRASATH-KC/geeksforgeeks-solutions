// Problem: Intersection of Two Linked Lists
//link:https:https://leetcode.com/problems/intersection-of-two-linked-lists/description/
// Platform: leetcode
// Difficulty: Easy
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set <ListNode>s =new HashSet<>();
        ListNode tempA=headA;
        while(tempA!=null){
            s.add(tempA);
            tempA=tempA.next;

        }
        ListNode tempB=headB;
        while(tempB!=null){
            if(s.contains(tempB))return tempB;
            tempB=tempB.next;
        }return null;
    }
}
