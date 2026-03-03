// Last updated: 3/3/2026, 1:28:09 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        Arrays.sort(nums);
6        for (int i = 0; i < nums.length - 2; i++) {
7
8            // Skip duplicate i values
9            if (i > 0 && nums[i] == nums[i - 1]) {
10                continue;
11            }
12
13            int left = i + 1;
14            int right = nums.length - 1;
15
16            while (left < right) {
17
18                int sum = nums[i] + nums[left] + nums[right];
19
20                if (sum == 0) {
21
22                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
23
24                    // Skip duplicates
25                    while (left < right && nums[left] == nums[left + 1]) {
26                        left++;
27                    }
28
29                    while (left < right && nums[right] == nums[right - 1]) {
30                        right--;
31                    }
32
33                    left++;
34                    right--;
35
36                } else if (sum < 0) {
37                    left++;   // need bigger value
38                } else {
39                    right--;  // need smaller value
40                }
41            }
42        }
43
44        return result;
45        
46    }
47}
48
49/*
50    concept:
51    1️⃣ sum == 0  → add result + skip duplicates + move both
52    2️⃣ sum < 0   → left++
53    3️⃣ sum > 0   → right--
54
55    Index:      0   1   2   3   4   5
56    after sort: -4  -1  -1  0   1   2
57
58    // Skip duplicate i values
59    if (i > 0 && nums[i] == nums[i - 1]) {
60    i = 2 → -1
61    nums[2] = -1
62    nums[1] = -1
63    Same value.
64    If we continue, we will again get so skip it
65
66
67    i = 0 → -4
68    Need total = 0
69
70    left = 1 (-1)
71    right = 5 (2)
72
73    Sum:
74    -4 + (-1) + 2 = -3
75
76    Is sum == 0? ❌
77    Is sum < 0? ✅ YES
78
79    So we do:
80    left++
81
82    Now:
83    left = 2 (-1)
84    right = 5 (2)
85    -4 + (-1) + 2 = -3
86    Still < 0 → left++
87
88    Now:
89    left = 3 (0)
90    -4 + 0 + 2 = -2
91    Still < 0 → left++
92
93    Now:
94    left = 4 (1)
95    -4 + 1 + 2 = -1
96    Still < 0 → left++
97
98    Now left = 5
99    left == right → stop
100    No answer for i = 0.
101
102    ********
103    i = 1 → -1
104
105    left = 2 (-1)
106    right = 5 (2)
107
108    Sum:
109    -1 + (-1) + 2 = 0
110
111    YES 🎉 Found valid triplet:
112    [-1, -1, 2]
113
114    Now duplicate skipping part
115    Check left side:
116    nums[2] == nums[3] ?
117    -1 == 0 ? NO
118    So left does NOT move here.
119
120    Check right side:
121    nums[5] == nums[4] ?
122    2 == 1 ? NO
123    So right does NOT move here.
124
125    Now we move both normally:
126    left++
127    right--
128
129    So:
130    left = 3
131    right = 4
132
133
134    Now check again:
135    -1 + 0 + 1 = 0
136    Again sum == 0 🎉
137    Add:
138    [-1, 0, 1]
139
140    Now skip duplicates again:
141    Left check:
142    nums[3] == nums[4] ?
143    0 == 1 ? NO
144    Right check:
145    nums[4] == nums[3] ?
146    1 == 0 ? NO
147
148    Then move:
149    left = 4
150    right = 3
151
152    Stop (left >= right)
153
154    ***************
155    i = 2 → -1
156
157    Now this line important:
158    if (nums[i] == nums[i-1])
159
160    At i = 2:
161
162    nums[2] = -1
163    nums[1] = -1
164
165    Same value.
166    If we continue, we will again get:
167
168    [-1, -1, 2]
169    [-1, 0, 1]
170
171    Duplicate results.
172    So we skip.
173
174    ****************
175    i = 3 → 0
176
177    left = 4
178    right = 5
179
180    0 + 1 + 2 = 3
181
182    Sum > 0
183    So:
184    right--
185    right = 4 → stop
186    Final Answer
187    [[-1,-1,2], [-1,0,1]]
188
189    *************
190
191*/