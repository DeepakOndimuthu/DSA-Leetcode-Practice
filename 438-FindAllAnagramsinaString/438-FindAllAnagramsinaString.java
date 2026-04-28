// Last updated: 4/28/2026, 1:28:42 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3     List<Integer> result = new ArrayList<>();
4
5        if (p.length() > s.length()) return result;
6
7        HashMap<Character, Integer> map = new HashMap<>();
8
9        // frequency of p
10        for (char ch : p.toCharArray()) {
11            map.put(ch, map.getOrDefault(ch, 0) + 1);
12        }
13
14        int start = 0;
15        int count = map.size();
16
17        for (int end = 0; end < s.length(); end++) {
18
19            char ch = s.charAt(end);
20
21            if (map.containsKey(ch)) {
22                map.put(ch, map.get(ch) - 1);
23
24                if (map.get(ch) == 0) {
25                    count--;
26                }
27            }
28
29            // window size = p.length()
30            if (end >= p.length() - 1) {
31
32                // if all matched → add index
33                if (count == 0) {
34                    result.add(start);
35                }
36
37                char leftChar = s.charAt(start);
38
39                if (map.containsKey(leftChar)) {
40                    map.put(leftChar, map.get(leftChar) + 1);
41
42                    if (map.get(leftChar) == 1) {
43                        count++;
44                    }
45                }
46
47                start++;
48            }
49        }
50
51        return result;
52    }
53}