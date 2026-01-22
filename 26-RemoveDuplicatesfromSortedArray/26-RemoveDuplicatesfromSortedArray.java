// Last updated: 1/22/2026, 5:10:36 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length == 0){
4            return 0;
5        }
6        int i =0;
7        for(int j = 1; j<nums.length;j++){
8            if(nums[j] != nums[i]){
9                i++;
10                nums[i] = nums[j];
11            }
12        }
13        //System.out.println(Arrays.toString(nums));
14        return i+1;
15        
16    }
17}