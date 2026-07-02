// Problem:License Key Formatting
//link:https://leetcode.com/problems/license-key-formatting/description/
// Platform: leetcode
// Difficulty: Easy
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int c=0;
        s=s.replace("-","").toUpperCase();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            c++;
            if(c==k&&i!=0){
                sb.append("-");
                c=0;
            }
        }return sb.reverse().toString();
    }
}
