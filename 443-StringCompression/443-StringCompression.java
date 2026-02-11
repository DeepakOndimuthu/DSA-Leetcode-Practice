// Last updated: 2/11/2026, 5:21:29 PM
1class Solution {
2    public int compress(char[] chars) {
3        int write = 0;
4        int read = 0;
5
6        while( read < chars.length){
7            char currentChar = chars[read];
8            int count = 0;
9
10           // count same characters
11            while(read < chars.length && currentChar == chars[read]){
12                read++;
13                count++;
14            }
15            // write character
16            chars[write++] =  currentChar; //write++ means use value first, then increase
17
18            // write count if more than 1
19            if(count > 1){
20                String countStr  = String.valueOf(count);
21                for(char ch : countStr.toCharArray()){
22                    chars[write++] =  ch;
23                }
24            }
25            
26        }
27        return write;
28        
29    }
30}
31
32/*
33Note
34chars[write++] = currentChar;
35Initially write = 0
36So: chars[0] = 'a'
37write becomes 1
38[a, ?, ?, ?, ?, ?, ?]
39     ↑
40   write
41countStr = "12" we save it 1 then 2 not 12
42and for loop if count 1 above time array is
43[a, 2, ?, ?, ?, ?, ?]
44        ↑
45      write
46*************************
47full visual
48[a, ?, ?, ?, ?, ?, ?]
49 ↑
50written
51[a, 2, ?, ?, ?, ?, ?]
52     ↑
53   write
54[a, 2, b, ?, ?, ?, ?]
55        ↑
56      write
57[a, 2, b, 2, ?, ?, ?]
58           ↑
59         write
60[a, 2, b, 2, c, ?, ?]
61              ↑
62            write
63[a, 2, b, 2, c, 3, ?]
64                 ↑
65               write
66
67*/