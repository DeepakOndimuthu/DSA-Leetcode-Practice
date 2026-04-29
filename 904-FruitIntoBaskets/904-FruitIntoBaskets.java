// Last updated: 4/29/2026, 11:32:48 AM
1class Solution {
2    public int totalFruit(int[] fruits) {
3       HashMap<Integer, Integer> map = new HashMap<>();
4
5        int start = 0;
6        int maxLength = 0;
7
8        for (int end = 0; end < fruits.length; end++) {
9
10            int fruit = fruits[end];
11
12            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
13
14            // allow only 2 types
15            while (map.size() > 2) {
16
17                int leftFruit = fruits[start];
18                map.put(leftFruit, map.get(leftFruit) - 1);
19
20                if (map.get(leftFruit) == 0) {
21                    map.remove(leftFruit);
22                }
23
24                start++;
25            }
26
27            maxLength = Math.max(maxLength, end - start + 1);
28        }
29
30        return maxLength;
31        
32    }
33}