// Last updated: 3/9/2026, 2:59:03 PM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4
5        for(char ch : s.toCharArray()){
6            map.put(ch, map.getOrDefault(ch,0)+1);
7        }
8        
9        PriorityQueue<Character> mapHeap = 
10        new PriorityQueue<>((a,b)->map.get(b) - map.get(a));
11        mapHeap.addAll(map.keySet());
12
13        StringBuilder result = new StringBuilder();
14        while(!mapHeap.isEmpty()){
15            char ch = mapHeap.poll();
16            int freq = map.get(ch);
17
18            for(int i =0; i<freq ; i++){
19                result.append(ch);
20            }
21        }
22        return result.toString();
23    }
24}