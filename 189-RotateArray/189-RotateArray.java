// Last updated: 1/18/2026, 8:54:24 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k%n;
5        reverse(nums, 0,n-1);
6        reverse(nums, 0,k-1);
7        reverse(nums, k,n-1);
8        
9    }
10
11    private static void reverse(int[] nums, int left, int right){
12
13        while(left < right){
14            int temp = nums[left];
15            nums[left] = nums[right];
16            nums[right] =  temp;
17            left++;
18            right--;
19        }
20    }
21}