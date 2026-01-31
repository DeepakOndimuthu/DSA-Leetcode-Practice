// Last updated: 1/31/2026, 4:37:57 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int [] freq = new int[26];
4
5        for(int i = 0; i< s.length();i++){
6            freq[s.charAt(i) - 'a']++;
7        }
8        for(int i = 0; i< s.length();i++){
9            if(freq[s.charAt(i) - 'a'] == 1){
10                return i;
11            }
12        }
13
14        return -1;
15        
16    }
17}