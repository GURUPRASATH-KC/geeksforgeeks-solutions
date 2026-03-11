// Problem: Max Consecutive Ones
//link:https:https://neetcode.io/problems/max-consecutive-ones/question
// Platform: neetcode.io
// Difficulty: Easy
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        int sum=0,h=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
               j=0;
            }else{
                j++;
                h=j;
                
            }sum=Math.max(sum,j);
        }if(sum>j)return sum;return h;
    }
}
