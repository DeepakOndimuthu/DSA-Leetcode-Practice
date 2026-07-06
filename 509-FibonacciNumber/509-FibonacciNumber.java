// Last updated: 7/6/2026, 1:40:52 PM
1class Solution {
2    public int fib(int n) {
3
4        if(n == 0){
5            return 0;
6        }
7
8        if(n == 1){
9            return 1;
10        }
11
12        // Recursive Calls
13        return fib(n-1) + fib(n-2);
14        
15    }
16}