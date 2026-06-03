// Problem:  Find the Duplicate Number
//link:https://leetcode.com/problems/find-the-duplicate-number/description/?envType=problem-list-v2&envId=binary-search
// Platform:leetcode
// Difficulty: Medium
class Solution {
    public int findDuplicate(int[] nums) {
        boolean []bool=new boolean[nums.length+1];

        for(int i:nums){
            if(bool[i]){
                return i;
            }
            bool[i]=true;
        }return 0;
    }
}


//another approach


class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];//->1
        int fast = nums[0];//->1

        do {
            slow = nums[slow];//nums[1]->3
            fast = nums[nums[fast]];//nums[nums[1]]->nums[3]->2
        } while (slow != fast);

        slow = nums[0];//->1

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
