class Solution {
// Problem: Replace Elements With Greatest Element On Right Side
//link:https:https://neetcode.io/problems/replace-elements-with-greatest-element-on-right-side/question
// Platform: neetcode.io
// Difficulty: Easy
    public int[] replaceElements(int[] arr) {

        int maxRight = -1;

        for(int i = arr.length - 1; i >= 0; i--){
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, current);
        }

        return arr;
    }
}
