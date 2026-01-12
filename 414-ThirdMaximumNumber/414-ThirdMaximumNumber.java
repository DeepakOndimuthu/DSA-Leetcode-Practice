// Last updated: 1/12/2026, 5:06:39 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        Long first = null;
4        Long second = null;
5        Long third = null;
6
7        for(int num: nums){
8
9            if((first!=null && num == first) ||
10            (second!=null && num == second) ||
11            (third!=null && num == third)) {
12                continue;
13            }
14            if(first == null || num > first){
15                third = second;
16                second = first;
17                first = (long) num;
18            }
19            else if ( second == null || num > second){
20                third = second;
21                second = (long) num;
22            }
23            else if (third == null || num > third){
24                third  = (long) num;
25            }
26        }
27        // if third max doesn't exist, return max
28        return third == null ? first.intValue() : third.intValue();
29        
30    }
31}