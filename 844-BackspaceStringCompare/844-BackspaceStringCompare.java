// Last updated: 2/2/2026, 2:48:10 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3
4            return buildString(s).equals(buildString(t));
5        
6    }
7
8    public static String buildString(String str){
9        StringBuilder result = new StringBuilder();
10        for(int i =0; i<str.length();i++){
11            char ch = str.charAt(i);
12            if(ch == '#'){
13                if(result.length() > 0){
14                    result.deleteCharAt(result.length() - 1);
15                }
16            }else{
17                    result.append(ch);
18                }
19        }
20            return result.toString();
21        }
22}