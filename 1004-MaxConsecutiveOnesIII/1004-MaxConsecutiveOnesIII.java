// Last updated: 4/20/2026, 8:23:46 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int start = 0;
4        int zeroCount = 0;
5        int maxLength = 0;
6
7        for (int end = 0; end < nums.length; end++) {
8            // Add the current number to the window
9            if (nums[end] == 0) {
10                zeroCount++;
11            }
12
13            // Shrink the window from the LEFT (start) if we have too many zeros
14            while (zeroCount > k) {
15                if (nums[start] == 0) { // Check 'start', not 'end'
16                    zeroCount--;
17                }
18                start++; // Move the left side forward
19            }
20
21            // Calculate the size of the current valid window
22            maxLength = Math.max(maxLength, end - start + 1);
23        }
24
25        return maxLength;
26    }
27}