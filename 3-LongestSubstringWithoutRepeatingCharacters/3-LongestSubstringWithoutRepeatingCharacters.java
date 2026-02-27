// Last updated: 2/27/2026, 4:57:55 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        HashMap<Character,Integer> map = new HashMap<>();
5        int left =0;
6        int maxLength = 0;
7        for(int right = 0; right < s.length(); right++){
8            char ch = s.charAt(right);
9            //System.out.println(ch);
10
11            if(map.containsKey(ch) && map.get(ch) >= left){
12                left = map.get(ch) + 1;
13            }
14
15            map.put(ch, right);
16            maxLength = Math.max(maxLength, right -left + 1);
17        }
18        return maxLength;
19        
20    }
21}