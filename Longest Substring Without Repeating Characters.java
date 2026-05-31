// Problem:  Longest Substring Without Repeating Characters
//link:https:https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// Platform: leetcode
// Difficulty: medium
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            Set<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
            //for(char ch:s.toCharArray()){
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);
                max = Math.max(max, set.size());
            }
        }
         return max;
    }
}
