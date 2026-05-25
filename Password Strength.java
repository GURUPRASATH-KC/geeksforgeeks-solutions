// Problem: Password Strength
//link:https://leetcode.com/problems/password-strength/description/
// Platform:leetcode
// Difficulty: medium
class Solution {
    public int passwordStrength(String password) {
        Set<Character>set=new HashSet<>(); 
        for(char i:password.toCharArray()){
            set.add(i);
        }
        String s1="";
        for(char ch:set){
            s1+=ch;
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(Character.isDigit(ch)){
                count+=3;
            }
            else if(Character.isLowerCase(ch)){
                count+=1;
            }
            else if(Character.isUpperCase(ch)){
                count+=2;
            }
            else{
                count+=5;
            }
        }return count;
    }
}
