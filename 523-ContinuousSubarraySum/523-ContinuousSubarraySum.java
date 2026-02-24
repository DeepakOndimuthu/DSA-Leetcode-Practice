// Last updated: 2/24/2026, 6:02:51 PM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3
4        HashMap<Integer,Integer> map= new HashMap<>();
5        int sum = 0;
6        map.put(0,-1); //importat we discuss in 560 sum why this initial 
7        // but this is minus one (-1)
8         for (int i = 0; i < nums.length; i++){
9            sum += nums[i];
10            int remainder = sum % k;
11
12            if(map.containsKey(remainder)){
13                int prevIndex  = map.get(remainder); 
14                if( i- prevIndex >= 2){
15                    return true;
16                }
17
18            }else{
19                map.put(remainder, i);
20            }
21        }
22        return false;
23    }   
24}
25
26/*
27subarray sum is multiple of k so its diff from 560
28560 is We want subarray sum == k
29that why we use : remainder
30
31map stores this sum remainder → index
32NOT frequency. so why we use -1;
33sum = 0
34index = -1
35
36
37Initial:
38map = {0 → -1}
39sum = 0
40
41Iteration 0
42sum = 23
43remainder = 23 % 6 = 5
44Is 5 in map? No.
45map = {0→-1, 5→0}
46
47Iteration 1 (i=1, num=2)
48sum = 25
49remainder = 25 % 6 = 1
50Is 1 in map? No.
51map = {0→-1, 5→0, 1→1}
52
53Iteration 2 (i=2, num=4)
54sum = 29
55remainder = 29 % 6 = 5
56Is 5 in map? YES.
57prevIndex = map.get(5) = 0
58
59i - prevIndex = 2 - 0 = 2
60Is 2 ≥ 2? YES.
61So return true.	
62*/