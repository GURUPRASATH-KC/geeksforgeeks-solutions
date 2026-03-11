class Solution {
// Problem: Concatenation of Array
//link:https://neetcode.io/problems/concatenation-of-array/question
// Platform: neetcode.io
// Difficulty: Easy
    public int lengthOfLastWord(String s) {
        String[]s1=s.split(" ");
        int max=s1[s1.length-1].length();
        return max;
    }
}
