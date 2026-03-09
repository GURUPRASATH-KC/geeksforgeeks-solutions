import java.util.*;
// Problem: Contains Duplicate
// Platform: neetcode.io
// Question link:https://neetcode.io/problems/duplicate-integer/question
// Difficulty: Easy
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> lst=new HashSet<>();
        for(int n:nums){
            lst.add(n);
        }return lst.size()!=nums.length;
    }
}
