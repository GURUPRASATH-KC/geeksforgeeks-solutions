// Problem: Type of Triangle
//link:https://leetcode.com/problems/type-of-triangle/description/?envType=problem-list-v2&envId=vcxyqvqj
// Platform: leetcode
// Difficulty: Easy
class Solution {
    public String triangleType(int[] nums) {
        if(nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[2] + nums[1] <= nums[0]) {
            return "none";
        }
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        String s1="isosceles";
        String s2= "scalene";
        String s3="equilateral";
        if(set.size()==2){
            return s1;
        }
        else if(set.size()==3){
            return s2;
        }else{
            return s3;
        }
    }
}
