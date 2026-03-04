// Last updated: 3/4/2026, 4:47:38 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3       List<List<Integer>> result = new ArrayList<>();
4
5        Arrays.sort(nums);
6
7        for (int i = 0; i < nums.length - 3; i++) {
8
9            // skip duplicate i
10            if (i > 0 && nums[i] == nums[i - 1])
11                continue;
12
13            for (int j = i + 1; j < nums.length - 2; j++) {
14
15                // skip duplicate j
16                if (j > i + 1 && nums[j] == nums[j - 1])
17                    continue;
18
19                int left = j + 1;
20                int right = nums.length - 1;
21
22                while (left < right) {
23
24                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
25
26                    if (sum == target) {
27
28                        result.add(Arrays.asList(
29                                nums[i], nums[j], nums[left], nums[right]));
30
31                        // skip duplicates
32                        while (left < right && nums[left] == nums[left + 1])
33                            left++;
34
35                        while (left < right && nums[right] == nums[right - 1])
36                            right--;
37
38                        left++;
39                        right--;
40
41                    } else if (sum < target) {
42                        left++;
43                    } else {
44                        right--;
45                    }
46                }
47            }
48        }
49
50        return result;
51    }
52}
53
54
55/*
56    Pattern
57    2Sum → 1 loop + HashMap / Two pointer
58    3Sum → 1 loop + Two pointer
59    4Sum → 2 loops + Two pointer
60    kSum → (k-2) loops + Two pointers
61
62    sum == target  → found answer
63    sum < target   → need bigger number → move left++
64    sum > target   → need smaller number → move right--
65
66    Length rule is:
67    If problem needs K numbers → loop until nums.length - (K-1)
68    3Sum Case
69    we need 3 numbers : a + b + c = 0
70    So we write: length - 2
71    Why -2?
72    Because after i, we still need 2 more numbers.
73
74    Example array:
75    index: 0 1 2 3 4 5
76    size = 6
77    i = 4
78    left = 5
79    right = 5
80    Only one number left ❌
81    But we need two numbers.
82    So last valid i must be 3.
83    nums.length - 2
84    6 - 2 = 4
85    Loop stops before 4 → last i = 3.
86    That guarantees All exist:
87    i, left, right
88
89    4Sum Case
90    we need 4 numbers: a + b + c + d = target
91    We fix first number i.
92    But we still need 3 more numbers.
93    [i] [j] [left] [right]
94    ↑    ↑    ↑      ↑
95    4 numbers
96
97    Steps:
98
99    1️⃣ Sort array
100    2️⃣ Fix first number i
101    3️⃣ Fix second number j
102    4️⃣ Use two pointers for remaining two numbers
103*/