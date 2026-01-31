// Last updated: 1/31/2026, 5:27:44 PM
1class Solution {
2    public String sortString(String s) {
3        int [] freq = new int[26];
4        // step 1: count frequency
5        for(int i = 0; i<s.length();i++){
6            freq[s.charAt(i) - 'a']++;
7        }
8        StringBuilder result = new StringBuilder();
9        int total = s.length();
10
11        while(total > 0){
12             // increasing order a → z
13            for(int i = 0; i < 26; i++){
14                if(freq[i] > 0){
15                    result.append((char) (i + 'a'));  
16                    freq[i]--;
17                    total--;
18                }
19            }
20
21           // decreasing order z → a
22            for(int i = 25; i >= 0; i--){
23                if(freq[i] > 0){
24                    result.append((char) (i + 'a'));
25                    freq[i]--;
26                    total--;
27                }
28            }
29        }
30        return result.toString();
31        
32    }
33}