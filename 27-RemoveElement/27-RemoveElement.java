// Last updated: 3/24/2026, 4:32:07 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int left = 0;
4
5        for (int right = 0; right < nums.length; right++) {
6
7            if (nums[right] != val) {
8                nums[left] = nums[right];
9                left++;
10            }
11        }
12
13        return left;
14    }
15}