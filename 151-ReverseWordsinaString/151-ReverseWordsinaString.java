// Last updated: 2/6/2026, 4:53:49 PM
1class Solution {
2    public String reverseWords(String s) {
3        String [] words = s.trim().split("\\s+");
4        StringBuilder result = new StringBuilder();
5    
6        for(int i = words.length -1 ; i>=0; i--){
7            result.append(words[i]);
8            if(i !=0){
9                result.append(" ");
10            }
11
12        }
13        return result.toString();
14        
15    }
16}