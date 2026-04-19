// Last updated: 4/19/2026, 7:46:29 PM
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
24    /*
25    HashSet only tells: Seen or not seen
26    here we must: Count how many times So we use HashMap
27
28    List all subarrays:EX1
29    [1]        → 1
30    [1,1]      → 2  ✅
31    [1,1,1]    → 3
32    [1]     → 1
33    [1,1]   → 2  ✅
34        [1]  → 1
35
36    Valid ones
37    [1,1] (index 0–1)
38    [1,1] (index 1–2)
39    Count = 2
40
41    Example 2
42    [1] → 1
43    [1,2] → 3 ✅
44    [1,2,3] → 6
45    [2] → 2
46    [2,3] → 5
47        [3] → 3 ✅
48
49    Valid ones
50    [1,2]
51    [3]
52    Count = 2
53
54    we store sums {0→1, 1→1, 3→1} ✅
55    not values {1→1, 2→1, 3→1}   ❌
56
57    we remove this line
58    map.put(0,1);
59    sum-k = 3-3 = 0
60    map.containsKey(0) ? so why 
61    we MISS subarray [1,2]
62
63    */