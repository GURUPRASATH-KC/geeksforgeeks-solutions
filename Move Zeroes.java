// Problem:Move Zeroes
//link:https:https://leetcode.com/problems/move-zeroes/?envType=problem-list-v2&envId=array
// Platform: leetcode
// Difficulty: Easy
class Solution {
    public void moveZeroes(int[] nums) {
        int ind=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ind++]=nums[i];
            }else{
                c++;
            }
        }for(int i=0;i<c;i++){
            nums[ind++]=0;
        }
    }
}
