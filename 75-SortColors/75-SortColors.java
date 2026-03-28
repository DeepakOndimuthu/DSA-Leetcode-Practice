// Last updated: 3/28/2026, 6:06:56 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0; // next position for 0
4        int mid = 0; // current element
5        int high = nums.length - 1; // next position for 2
6
7        while(mid <= high){
8
9            if(nums[mid] == 0){
10                int temp = nums[mid];
11                nums[mid] = nums[low];
12                nums[low] = temp;
13
14                low++;
15                mid++;
16
17            }else if(nums[mid] == 1){
18                mid++; // already correct
19            } else { // nums[mid] == 2
20
21                int temp = nums[mid];
22                nums[mid] = nums[high];
23                nums[high] = temp;
24
25                high--;
26            }
27            
28        }
29        
30    }
31}
32
33/*
34    Dutch National Flag problem
35
36    If 0 → swap with low
37    If 1 → just move
38    If 2 → swap with high
39
40    low → where 0 should go
41    mid → current element
42    high → where 2 should go
43
44    Step Example
45    [2,0,2,1,1,0]
46
47    Process → result:
48    [0,0,1,1,2,2]
49
50    memory trich
51    0 → left
52    1 → middle
53    2 → right
54
55    ********
56    concept
57    Real Life Example
58
59    Imagine:
60    You are sorting balls:
61
62    Red (0)
63    White (1)
64    Blue (2)
65
66    Now:
67    Left basket → red
68    Right basket → blue
69    You are standing in middle and picking balls one by one
70
71    YOU = mid
72    Without you:
73    Who will pick balls and check color?
74*/