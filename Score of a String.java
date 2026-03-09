// Problem:Score of a String
// Platform: neetcode.io
// Difficulty: easy
//link:https://neetcode.io/problems/score-of-a-string/question?list=allNC
class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            score+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }return score;
    }
}
