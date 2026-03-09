import java.util.*;
// Problem: Concatenation of Array
//link:https://neetcode.io/problems/concatenation-of-array/question
// Platform: neetcode.io
// Difficulty: Easy
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }return ans;
    }
}
