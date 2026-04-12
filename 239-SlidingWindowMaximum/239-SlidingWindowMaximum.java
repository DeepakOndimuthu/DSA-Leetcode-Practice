// Last updated: 4/12/2026, 4:50:07 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int n = nums.length;
4        int[] result = new int[n - k + 1];
5
6        Deque<Integer> dq = new ArrayDeque<>();
7        int start = 0;
8
9        for (int end = 0; end < n; end++) {
10
11            // 1. remove smaller elements from back
12            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[end]) {
13                dq.pollLast();
14            }
15
16            // 2. add current index
17            dq.offerLast(end);
18
19            // 3. remove elements outside window
20            if (dq.peekFirst() < end - k + 1) {
21                dq.pollFirst();
22            }
23
24            // 4. when window is ready
25            if (end >= k - 1) {
26                result[start] = nums[dq.peekFirst()];
27                start++;
28            }
29        }
30
31        return result;
32        
33    }
34}