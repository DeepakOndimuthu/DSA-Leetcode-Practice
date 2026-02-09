// Last updated: 2/9/2026, 12:55:09 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if(strs == null || strs.length == 0 ){
4            return "";
5        }
6        String prefix = strs[0];
7        //System.out.println(prefix);
8        for(int i =0; i <strs.length; i++){
9
10            while(strs[i].indexOf(prefix) != 0){
11                prefix = prefix.substring(0, prefix.length() - 1);
12            }
13            if(prefix.isEmpty()){
14                return "";
15            }
16        }
17        return prefix;
18        
19    }
20}
21
22/*
23Idea:
24Take first word as prefix
25"flower"
26Compare with next word
27"flow"
28Common part → "flow"
29Compare with next word
30"flight"
31Reduce prefix step by step:
32flow → flo → fl ✅
33
34note:
35"flow".indexOf("flower") → -1  // Not equal to 0 → enter while loop.
36so reduce prefix
37prefix = "flowe"
38"flow".indexOf("flowe") → -1
39so reduce again
40prefix = "flow"
41"flow".indexOf("flow") → 0 ✅
42
43now current prefix is "flow"
44"flight".indexOf("flow") → -1
45Reduce
46"flight".indexOf("flo") → -1
47Reduce:
48"flight".indexOf("fl") → 0 ✅
49
50 */