// Last updated: 5/6/2026, 5:32:14 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        // store: number -> next greater
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        Stack<Integer> stack = new Stack<>();
7
8        // traverse nums2 from right
9        for (int i = nums2.length - 1; i >= 0; i--) {
10
11            int current = nums2[i];
12
13            // remove smaller elements
14            while (!stack.isEmpty() && stack.peek() <= current) {
15                stack.pop();
16            }
17
18            // if stack empty -> no greater element
19            if (stack.isEmpty()) {
20                map.put(current, -1);
21            } else {
22                map.put(current, stack.peek());
23            }
24
25            // push current element
26            stack.push(current);
27        }
28
29        // build answer for nums1
30        int[] result = new int[nums1.length];
31
32        for (int i = 0; i < nums1.length; i++) {
33            result[i] = map.get(nums1[i]);
34        }
35
36        return result;
37    }
38        
39}