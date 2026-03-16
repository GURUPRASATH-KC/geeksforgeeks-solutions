class Solution {
// Problem: Median of Two Sorted Arrays
//link:https:https://leetcode.com/problems/median-of-two-sorted-arrays/description/
// Platform: leetcode
// Difficulty: hard
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int ans[]=new int [nums1.length+nums2.length];
		int ind=0;
        for(int i=0;i<nums1.length;i++){
            ans[ind++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++) {
        	ans[ind++]=nums2[i];
        }Arrays.sort(ans);double s=0;
        if(ans.length%2!=0) {
        	//System.out.println(ans[ans.length%2]);
            return ans[ans.length/2];
        }
        else {
			/*
			 * System.out.println(ans[ans.length/2-1]);
			 * System.out.println(ans[ans.length/2+1-1]);
			 */
        	float sum=ans[ans.length/2-1]+ans[(ans.length/2)+1-1];
        	s=sum/2.0;
        //	System.out.printf("%.5f",s);
        }return s;
    }
}
