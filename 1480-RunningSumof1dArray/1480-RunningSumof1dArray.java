// Last updated: 7/21/2026, 12:47:52 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3
4        calculate(nums, 1);
5        return nums;
6        
7    }
8
9    public void calculate(int[] nums, int index){
10
11        // Base Case
12        if(index == nums.length){
13            return;
14        }
15
16        // Add previous value to current value
17        nums[index] = nums[index] + nums[index - 1];
18
19        // Recursive Call
20        calculate(nums, index + 1);
21    }
22}