// Problem: Next Greater Element II
//link:https://leetcode.com/problems/next-greater-element-ii/description/?envType=problem-list-v2&envId=dr1jzx2i
// Platform: leetcode
// Difficulty: medium
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 2*n; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%nums.length]) {
                ans[stack.pop()] = nums[i%nums.length];
            }
            stack.push(i%nums.length);
        }

        return ans;
    }
}
