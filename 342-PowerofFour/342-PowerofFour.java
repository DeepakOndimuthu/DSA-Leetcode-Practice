// Last updated: 7/28/2026, 11:39:06 AM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3
4         // Base Case
5        if(n == 1){
6            return true;
7        }
8
9         // Invalid Number
10        if( n <= 0 || n % 4 != 0){
11            return false;
12        }
13
14        // Recursive Call
15        return isPowerOfFour( n / 4 );
16        
17    }
18}