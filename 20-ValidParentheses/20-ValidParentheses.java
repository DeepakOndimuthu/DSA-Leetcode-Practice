// Last updated: 5/1/2026, 12:52:21 PM
1class Solution {
2    public boolean isValid(String s) {
3        
4       Stack<Character> stack = new Stack<>();
5
6        for (int i = 0; i < s.length(); i++) {
7
8            char ch = s.charAt(i);
9
10            // opening brackets
11            if (ch == '(' || ch == '{' || ch == '[') {
12                stack.push(ch);
13            }
14            // closing brackets
15            else {
16
17                // if stack empty → invalid
18                if (stack.isEmpty()) {
19                    return false;
20                }
21
22                char top = stack.pop();
23
24                // check matching
25                if ((ch == ')' && top != '(') ||
26                        (ch == '}' && top != '{') ||
27                        (ch == ']' && top != '[')) {
28
29                    return false;
30                }
31            }
32        }
33
34        // if stack empty → valid
35        return stack.isEmpty();
36        
37    }
38}