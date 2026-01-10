// Last updated: 1/10/2026, 8:28:38 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int expectedSum = n*(n+1)/2;
5        int actualSum = 0;
6        for(int num: nums){
7            actualSum += num;
8        
9        }
10       return expectedSum - actualSum;
11        
12    }
13}