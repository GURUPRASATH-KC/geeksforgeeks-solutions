// Problem: Longest Palindromic Substring
//link:https://leetcode.com/problems/longest-palindromic-substring/description/
// Platform: leetcode
// Difficulty: medium

class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){

                if(Palindromic_Substring(s,i,j)==true){
                    if(j-i+1>res.length()){
                        res=s.substring(i,j+1);
                    }
                }
            }
        }return res;
    }
    private boolean Palindromic_Substring(String s,int left,int right){

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }left++;right--;
        }return true;
    }
}

//another approach
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0,end=0;

        for(int i=0;i<n;i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);

            int len=Math.max(len1,len2);

            if(len>(end-start)){
                start =i-(len-1)/2;
                end=i+len/2;
            }
        }return s.substring(start,end+1);
    }
    private int expand(String s, int left, int right){

    while(left >= 0 &&
          right < s.length() &&
          s.charAt(left) == s.charAt(right)){

        left--;
        right++;
    }

    return right - left - 1;
}
}
