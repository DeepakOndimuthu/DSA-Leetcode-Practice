// Last updated: 5/8/2026, 1:28:26 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3
4        int n = nums.length;
5
6        int[] result = new int[n];
7
8        Stack<Integer> stack = new Stack<>();
9
10        // default all values = -1
11        for (int i = 0; i < n; i++) {
12            result[i] = -1;
13        }
14
15        // traverse 2 times
16        for (int i = 2 * n - 1; i >= 0; i--) {
17
18            int current = nums[i % n];
19
20            // remove smaller elements
21            while (!stack.isEmpty() && stack.peek() <= current) {
22                stack.pop();
23            }
24
25            // store answer only first pass
26            if (i < n) {
27
28                if (!stack.isEmpty()) {
29                    result[i] = stack.peek();
30                }
31            }
32
33            // push current element
34            stack.push(current);
35        }
36
37        return result;
38    }
39}
40
41/*
42    circular Array:
43    nums = [1,2,1] means two times search 
44    like right to left time greater find
45    after the end of first time 1 reach then again loop it 
46
47    ***************
48
49    Example
50    n = 3
51
52    i	i % n
53    0	0
54    1	1
55    2	2
56    3	0
57    4	1
58    5	2
59
60    Array repeats 
61
62    *****************
63
64    Input:
65    [1,2,1]
66    Circular view:
67    1,2,1,1,2,1
68
69    For first 1:
70    next greater = 2
71
72    For 2:
73    nothing bigger
74    -1
75
76    For last 1:
77    go circular → 2 found
78
79    *****************
80    store answer only first pass
81    if (i < n) {
82    Loop:
83
84    5 4 3 | 2 1 0
85    ---------
86    helper  real
87
88    ******************
89
90    RULE
91    Traverse twice
92    Use % n for circular indexing
93    Same monotonic stack logic
94
95    ************
96
97*/