// Problem: Third Maximum Number
//link:https://leetcode.com/problems/third-maximum-number/?envType=problem-list-v2&envId=array
// Platform: leetcode
// Difficulty: Easy
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer>set1=new LinkedHashSet<>();
        for(int n:nums){
            set1.add(n);
        }
        int []ans=new int[set1.size()];
        int ind=0;
        for(int n:set1){
            ans[ind++]=n;
        }
        if(ans.length>=3){
             return ans[ans.length-3];
        }return ans[ans.length-1];
       
    }
}
