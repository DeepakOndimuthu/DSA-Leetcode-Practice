// Last updated: 4/24/2026, 5:35:30 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        
4         HashMap<Character, Integer> map = new HashMap<>();
5
6        int start = 0;
7        int maxCount = 0;   // count of most frequent char in window
8        int maxLength = 0;
9
10        for (int end = 0; end < s.length(); end++) {
11
12            char ch = s.charAt(end);
13
14            map.put(ch, map.getOrDefault(ch, 0) + 1);
15
16            // track max frequency
17            maxCount = Math.max(maxCount, map.get(ch));
18
19            // window size - maxCount = changes needed
20            while ((end - start + 1) - maxCount > k) {
21
22                char leftChar = s.charAt(start);
23                map.put(leftChar, map.get(leftChar) - 1);
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