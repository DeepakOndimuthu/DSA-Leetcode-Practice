// Last updated: 1/14/2026, 1:27:08 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        /*
5        To make pairs, we need two loops.
6        First number → pick one
7        Second number → check with all remaining numbers
8        second number index (always after i) -> j = i + 1
9       */
10
11        for(int i =0; i< nums.length ; i++){
12            for(int j =  i+1; j < nums.length; j++){
13
14                if(nums[i] + nums[j] == target){
15                    return new int[]{i,j};
16
17                }
18            }
19        }
20         return new int[]{-1, -1};
21        
22    }
23}