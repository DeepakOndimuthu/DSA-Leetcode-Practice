// Last updated: 2/4/2026, 12:27:16 PM
1class Solution {
2    
3    // method 1: without split()
4    public int countSegments(String s) {
5        int count = 0;
6        boolean isWord = false;
7        for(int i = 0; i <s.length(); i++){
8            char ch = s.charAt(i);
9            if(ch != ' ' && !isWord){
10                count++;
11                isWord = true;
12
13            }else if(ch == ' '){
14              isWord = false;
15            }
16        }
17        return count;
18        
19    }
20    /*
21    // method 2: using split (simple)
22    public static int countWordsUsingSplit(String s) {
23
24        if (s == null || s.trim().isEmpty()) {
25            return 0;
26        }
27        return s.trim().split("\\s+").length;
28    }
29    */
30}