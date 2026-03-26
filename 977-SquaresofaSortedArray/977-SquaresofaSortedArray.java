// Last updated: 3/26/2026, 4:51:47 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int [] result = new int[n];
5        int left = 0;
6        int right = n - 1;
7        int k = n -1;
8
9        while( left <= right){
10            int leftSquare = nums[left]*nums[left];
11            int rightSquare = nums[right]*nums[right];
12
13            if(leftSquare > rightSquare){
14                result[k] = leftSquare;
15                left++;
16            }else{
17                 result[k] = rightSquare;
18                right--;
19            }
20            k--;
21        }
22
23        return result;
24        
25    }
26}