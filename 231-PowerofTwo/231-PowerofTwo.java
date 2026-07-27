// Last updated: 7/27/2026, 12:13:42 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3         // Base Case
4         if(n == 1){
5            return true;
6         }
7        
8
9        // Invalid Number
10        if(n <= 0 || n % 2 != 0){
11            return false;
12        }
13       
14
15        // Recursive Call
16        return isPowerOfTwo(n/2);
17        
18    }
19}