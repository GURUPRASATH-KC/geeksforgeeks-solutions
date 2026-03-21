// Problem:Move Zeroes
//link:https:https://leetcode.com/problems/first-missing-positive/description/?submissionId=1953575099
// Platform: leetcode
// Difficulty: Hard
class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
        
        int target = 1;

        for (int i = 0; i < nums.length; i++) {
                       
            if (nums[i] == target) {
                target++;  
            } 
            else if (nums[i] > target) {
                return target;  
            }
        }
        return target;
    }
}
