// Problem: Search a 2D Matrix II
//link:https://leetcode.com/problems/search-a-2d-matrix-ii/description/?envType=problem-list-v2&envId=binary-search
// Platform:leetcode
// Difficulty: medium
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int r=0;
        int c=col-1;
        while(r<row&&c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]<target){
                r+=1;
            }
            else{
                c-=1;
            }
        }return false;
    }
}
