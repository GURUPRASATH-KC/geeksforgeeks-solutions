import java.util.Arrays;

// Problem: Missing in Array
// Platform: GeeksforGeeks
// Difficulty: Easy

class Solution {
    int missingNum(int arr[]) {

        Arrays.sort(arr);

        int ind = arr[0];

        if(ind != 1) return ind - 1;

        for(int i = 0; i < arr.length; i++) {
            if(ind != arr[i]) {
                return ind;
            }
            ind++;
        }

        return ind;
    }
}
