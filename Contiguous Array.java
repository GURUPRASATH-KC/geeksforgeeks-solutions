// Problem:Contiguous Array
//link:https://leetcode.com/problems/contiguous-array/description/?envType=problem-list-v2&envId=dpfeqijs
// Platform: leetcode
// Difficulty: medium

class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            count+=nums[i];
            max=Math.max(max,i-map.getOrDefault(count,i));
            map.putIfAbsent(count,i);
        }return max;
    }
}
