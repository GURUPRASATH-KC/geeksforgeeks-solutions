// Problem: Zigzag Conversion
//link:https:https://leetcode.com/problems/zigzag-conversion/description/
// Platform:leetcode
// Difficulty:medium
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);

            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }

            if (goingDown) {
                currRow++;
            } else {
                currRow--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
