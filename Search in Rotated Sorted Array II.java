// Problem:  Search in Rotated Sorted Array II
//link:https:https://leetcode.com/problems/search-in-rotated-sorted-array-ii/?envType=problem-list-v2&envId=binary-search
// Platform: leetcode
// Difficulty: Medium
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]<target){
                start++;
            }else{
                end--;
            }
        }return false;
    }
}
