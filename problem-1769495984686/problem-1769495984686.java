// Last updated: 1/27/2026, 12:09:44 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currentSum = nums[0];
4        int maxSum =  nums[0];
5
6        for(int i =1; i<nums.length;i++){
7            currentSum = Math.max( nums[i] , currentSum + nums[i]);
8            maxSum = Math.max(maxSum, currentSum);
9        }
10     return maxSum;
11    }
12}