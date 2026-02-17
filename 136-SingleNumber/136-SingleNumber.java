// Last updated: 2/17/2026, 4:41:03 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3
4        HashMap<Integer,Integer> map = new HashMap<>();
5
6        // Step 1: count frequency
7        for(int num : nums){
8            map.put(num, map.getOrDefault(num,0) + 1);
9        }
10
11        // Step 2: find first element with frequency 1
12        for(int num : nums){
13            if(map.get(num) == 1){
14                return num;
15            }
16        }
17        return -1; // no such element
18        
19    }
20}