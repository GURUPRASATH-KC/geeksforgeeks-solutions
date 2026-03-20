class Solution {
// Problem: Search in Rotated Sorted Array
//link:https:https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=array&
// Platform: leetcode
// Difficulty: medium
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }return -1;
    }
}
