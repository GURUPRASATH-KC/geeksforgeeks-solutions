// Problem: Valid Perfect Square
//link:https://leetcode.com/problems/valid-perfect-square/description/?envType=problem-list-v2&envId=binary-search
// Platform: leetcode
// Difficulty: Easy
class Solution {
    public boolean isPerfectSquare(int num) {
        int root = (int) Math.sqrt(num);
        return root * root == num;
    }
}
