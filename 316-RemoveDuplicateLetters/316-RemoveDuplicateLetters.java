// Last updated: 2/8/2026, 8:38:31 PM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int [] freq = new int[26];
4        boolean [] used = new boolean[26];
5
6       // Step 1: count frequency
7        for(char ch: s.toCharArray()){
8            freq[ch-'a']++;
9        }
10        /*
11        // Step 2: print result once
12        for(int i =0; i < s.length();i++){
13            if(freq[i]>0){
14            System.out.println( (char)(i + 'a') + "->" + freq[i]);
15            }
16        }
17        */
18        StringBuilder result = new StringBuilder();
19
20        for(char ch: s.toCharArray()){
21            int index = ch-'a';
22            freq[index]--; //later in the while loop we check:freq[lastChar] > 0
23
24            //System.out.println(index);
25            //System.out.println(freq[index]);
26
27            //character is already added, we should not add it again.
28            if(used[index]){
29                continue;
30            }
31
32           //while -> keep checking again and again until condition becomes false
33           // this first inupu result we reomve the one by one result = "bc" so why while
34           //a < b → true middle while part example check the keeping lexicographical (alphabetical) order
35           // last part while condition is , if this charcter again come so check so we remove it
36            while( result.length() > 0 &&
37            ch < result.charAt(result.length() - 1) &&
38            freq[result.charAt(result.length() - 1) - 'a'] > 0
39            ){
40                used[result.charAt(result.length() - 1) - 'a'] = false;
41                result.deleteCharAt(result.length() - 1);
42            }
43
44            result.append(ch);
45            used[index] = true;
46
47        }
48        return result.toString();
49    }
50}