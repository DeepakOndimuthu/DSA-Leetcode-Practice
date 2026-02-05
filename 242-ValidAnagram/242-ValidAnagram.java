// Last updated: 2/5/2026, 11:50:32 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        // step 1: length check
5        if(s.length() != t.length()){
6            return false;
7        }
8
9        int [] freq = new int[26];
10
11        // step 2: count characters of s
12        for(int i =0; i < s.length();i++){
13            freq[s.charAt(i) - 'a']++;
14        }
15
16        // step 3: reduce using characters of t
17        for(int i =0; i < t.length();i++){
18            freq[t.charAt(i) - 'a']--;
19
20        }
21
22        // step 4: check all counts are zero
23        for(int count : freq){
24            if(count != 0){
25                return false;
26            }
27        }
28
29        return true;
30        
31    }
32}