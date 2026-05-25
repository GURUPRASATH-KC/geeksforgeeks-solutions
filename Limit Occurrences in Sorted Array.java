// Problem:Limit Occurrences in Sorted Array
//link:https://leetcode.com/problems/limit-occurrences-in-sorted-array/description/
// Platform:leetcode
// Difficulty: Easy
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer>lst=new ArrayList<>();
        Map<Integer,Integer>mp=new HashMap<>();// used for count occurance ie 1=>0 1=>1 
        for(int i:nums){
            int count=mp.getOrDefault(i,0);
            if(count<k){
                lst.add(i);
                mp.put(i,count+1);
            }
            
        }
        int arr[]=new int[lst.size()];
        int j=0;
        for(int i:lst){
            arr[j]=i;
            j++;

        }return arr;
    }
}
