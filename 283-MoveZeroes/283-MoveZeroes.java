// Last updated: 1/14/2026, 1:21:14 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index =0;
4
5        // step 1: move non-zero elements
6        for(int i = 0; i < nums.length; i++){
7            if(nums[i] != 0){
8                nums[index] = nums[i];
9                index++;
10            }
11        }
12
13       // this time index is 3
14       // System.out.println("Index value is "+ index);
15
16       // step 2: fill remaining with zero
17        while(index < nums.length){
18            nums[index] = 0;
19            index++;
20        }
21        // this time index go to 5
22        //System.out.println("Index value is "+ index);
23
24        
25    }
26}