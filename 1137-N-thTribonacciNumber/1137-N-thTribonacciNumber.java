// Last updated: 7/13/2026, 12:44:27 PM
1class Solution {
2    int [] memo ;
3    public int tribonacci(int n) {
4
5        memo = new int[n+1];
6
7        return calculate(n);
8    }
9
10    public int calculate(int n){
11        
12        // Base Cases
13        if( n == 0){
14            return 0;
15        }
16
17        if( n ==1 || n == 2 ){
18            return 1;
19        }
20
21        // Already Calculated
22        if(memo[n] != 0){
23            return memo[n];
24        }
25
26        // Store Answer
27        memo[n] = calculate(n-1) + calculate(n-2) + calculate(n-3);
28        return memo[n];
29    }
30}