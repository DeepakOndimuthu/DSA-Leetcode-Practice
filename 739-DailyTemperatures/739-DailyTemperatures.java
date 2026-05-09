// Last updated: 5/9/2026, 2:14:05 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3       int n = temperatures.length;
4
5        int[] result = new int[n];
6
7        Stack<Integer> stack = new Stack<>();
8
9        // traverse from right
10        for (int i = n - 1; i >= 0; i--) {
11
12            // remove smaller or equal temperatures
13            while (!stack.isEmpty() &&
14                    temperatures[stack.peek()] <= temperatures[i]) {
15
16                stack.pop();
17            }
18
19            // if warmer day exists
20            if (!stack.isEmpty()) {
21                result[i] = stack.peek() - i;
22            }
23
24            // push current index
25            stack.push(i);
26        }
27
28        return result;
29
30    }
31}
32
33/*
34concept
35how many days to wait for warmer temperature.
36
37Day 0:73
38Next warmer:74
39after:1 day
40So: result[0] = 1
41
42Day 2:75
43Next warmer:76
44Distance:6 - 2 = 4
45So: result[2] = 4
46
47
48we store this problem index stack.push(i); 
49so why use temperatures[stack.peek()] not normal stack.peek()
50
51result[i] = stack.peek() - i;
52result[2] = 6 - 2 = 4;
53
54*/