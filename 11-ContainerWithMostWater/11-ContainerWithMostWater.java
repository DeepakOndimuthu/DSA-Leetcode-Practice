// Last updated: 3/23/2026, 6:02:32 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6
7        while(left < right){
8            int h = Math.min(height[left], height[right]);
9            int width = right - left;
10            int area = h * width;
11
12            maxArea = Math.max(maxArea, area);
13
14            // move smaller height
15            if(height[left] < height[right]){
16                left++;
17            }else{
18                right--;
19            }
20        }
21
22        return maxArea;
23
24        
25    }
26}