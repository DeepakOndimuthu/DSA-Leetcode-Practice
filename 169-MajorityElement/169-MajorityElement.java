// Last updated: 1/18/2026, 8:47:47 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count = 0;
4        int candidate = 0;
5
6        for(int num : nums){
7            if(count == 0){
8                candidate = num;
9            }
10            if(num == candidate){
11                count++;
12            }else{
13                count--;
14            }
15        }
16        return candidate;
17        
18    }
19}