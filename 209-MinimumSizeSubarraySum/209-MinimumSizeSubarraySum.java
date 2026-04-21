// Last updated: 4/21/2026, 11:17:36 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int start = 0;
4        int windowSum = 0;
5        int minLength = Integer.MAX_VALUE;
6
7        for (int end = 0; end < nums.length; end++) {
8
9            windowSum += nums[end];
10
11            // when sum >= k → try to shrink
12            while (windowSum >= target) {
13
14                minLength = Math.min(minLength, end - start + 1);
15
16                windowSum -= nums[start];
17                start++;
18            }
19        }
20
21        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
22        
23    }
24}