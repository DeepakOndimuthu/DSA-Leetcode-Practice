// Last updated: 2/23/2026, 10:48:47 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        // Step 1: Count frequency
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int num : nums){
7            map.put(num, map.getOrDefault(num,0)+ 1);
8        }
9
10        // Step 2: Max Heap based on frequency
11        PriorityQueue<Integer> mapHeap = 
12        new PriorityQueue<>( (a,b) -> (map.get(b) - map.get(a)) );
13        mapHeap.addAll(map.keySet());
14
15       // Step 3: Extract top k elements
16        int [] result  = new int[k];
17        for(int i = 0; i<k;i++){
18            result[i] = mapHeap.poll();
19        }
20        return result;
21        
22    }
23}