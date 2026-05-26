// Problem: Count the Number of Special Characters I
//link:https://leetcode.com/problems/count-the-number-of-special-characters-i/description/?envType=daily-question&envId=2026-05-26
// Platform: leetcode
// Difficulty: Easy
class Solution {
    public int numberOfSpecialChars(String word) {
        
        Set<Character>set1=new HashSet<>();
        Set<Character>set2=new HashSet<>();

        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                set1.add(ch);

            }else{
                set2.add(Character.toLowerCase(ch));
            }
        }int count=0;
        for(char ch:set1){
            if(set2.contains(ch)){
                count ++;
            }
        }return count;

    }
}
