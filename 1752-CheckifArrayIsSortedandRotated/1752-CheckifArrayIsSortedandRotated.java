// Last updated: 1/11/2026, 4:52:21 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int count = 0;
4        int n = nums.length;
5
6        // check adjacent elements
7        for(int i =0; i < n -1;i++){
8            if(nums[i] > nums[i + 1]){
9                count++;
10            }
11        }
12
13       // check last and first (circular)
14        if(nums[n-1] > nums[0]){
15            count++;
16        }
17
18        return count <=1;
19    }
20}