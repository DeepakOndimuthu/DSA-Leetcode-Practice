// Last updated: 1/12/2026, 5:25:45 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        // Step 1: Sort the array
4        Arrays.sort(nums);
5
6        //System.out.println(Arrays.toString(nums));
7
8        // Step 2: Return kth largest
9        return nums[nums.length - k];
10        
11    }
12}