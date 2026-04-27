// Last updated: 4/27/2026, 11:25:48 AM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3       if (s1.length() > s2.length()) return false;
4
5        HashMap<Character, Integer> map = new HashMap<>();
6
7        // count frequency of s1
8        for (char ch : s1.toCharArray()) {
9            map.put(ch, map.getOrDefault(ch, 0) + 1);
10        }
11
12        int start = 0;
13        int count = map.size();
14
15        for (int end = 0; end < s2.length(); end++) {
16
17            char ch = s2.charAt(end);
18
19            if (map.containsKey(ch)) {
20                map.put(ch, map.get(ch) - 1);
21
22                if (map.get(ch) == 0) {
23                    count--;
24                }
25            }
26
27            // window size = s1.length()
28            if (end >= s1.length() - 1) {
29
30                if (count == 0) return true;
31
32                char leftChar = s2.charAt(start);
33
34                if (map.containsKey(leftChar)) {
35                    map.put(leftChar, map.get(leftChar) + 1);
36
37                    if (map.get(leftChar) == 1) {
38                        count++;
39                    }
40                }
41
42                start++;
43            }
44        }
45
46        return false;
47        
48    }
49}