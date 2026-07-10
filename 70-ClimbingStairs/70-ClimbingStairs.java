// Last updated: 7/10/2026, 3:10:43 PM
1class Solution {
2    int [] memo ;
3    public int climbStairs(int n) {
4
5     memo = new int[n + 1];
6     return climb(n);
7    
8    }
9
10    public int climb(int n){
11        // Base Cases
12        if(n == 1){
13            return 1;
14        }
15
16        if(n == 2){
17            return 2;
18        }
19
20        if(memo[n] != 0){
21            return memo[n];
22        }
23
24        // Recursive Calls
25        // Store Answer
26        memo[n] = climb(n - 1) + climb(n - 2);
27        return memo[n];
28    }
29}