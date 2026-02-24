// Last updated: 2/24/2026, 3:54:16 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3
4        HashMap<Integer,Integer> map = new HashMap<>();
5        int sum =0;
6        int count =0;
7        map.put(0,1);
8
9        for(int num : nums){
10            sum += num;
11            // Check if (sum - k) exists
12            if(map.containsKey(sum - k)){
13            count += map.get(sum -k);
14            }
15
16            // Store current sum
17            map.put(sum,map.getOrDefault(sum,0)+ 1);
18        }
19        return count;
20        
21    }
22}
23
24/*
25HashSet only tells: Seen or not seen
26here we must: Count how many times So we use HashMap
27
28List all subarrays:EX1
29[1]        → 1
30[1,1]      → 2  ✅
31[1,1,1]    → 3
32   [1]     → 1
33   [1,1]   → 2  ✅
34      [1]  → 1
35
36Example 2
37[1] → 1
38[1,2] → 3 ✅
39[1,2,3] → 6
40   [2] → 2
41   [2,3] → 5
42      [3] → 3 ✅
43
44we store sums {0→1, 1→1, 3→1} ✅
45not values {1→1, 2→1, 3→1}   ❌
46
47we remove this line
48map.put(0,1);
49sum-k = 3-3 = 0
50map.containsKey(0) ? so why 
51we MISS subarray [1,2]
52
53*/