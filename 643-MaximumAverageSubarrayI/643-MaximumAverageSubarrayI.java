// Last updated: 4/8/2026, 3:47:42 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int windowSum = 0;
4        int maxSum = 0;
5        // first window
6        for(int i =0; i < k; i++){
7            windowSum += nums[i];
8        }
9
10       maxSum = windowSum;
11        // slide window
12        for(int i = k; i < nums.length; i++){
13            windowSum += nums[i]; // add next element
14            windowSum -= nums[i-k]; // remove first element of window
15
16            maxSum = Math.max(maxSum, windowSum);
17        }
18
19        return (double) maxSum / k;
20        
21    }
22}