// Last updated: 2/7/2026, 8:19:26 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder result = new StringBuilder();
4        for(char ch : s.toCharArray()){
5            int len = result.length();
6            if(len > 0 && 
7            result.charAt(len - 1) == ch){
8
9            result.deleteCharAt(len -1);
10
11            }else{
12            result.append(ch);
13            }
14        }
15        return result.toString();
16    }
17}