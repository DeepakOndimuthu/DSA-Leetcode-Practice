// Last updated: 7/8/2026, 7:31:32 PM
1class Solution {
2    public double myPow(double x, int n) {
3
4        long power = n;
5        if(power < 0){
6            x = 1/x;
7            power = -power;
8        }
9
10        return calculate(x, power);
11        
12    }
13
14    public double calculate(double x, long n){
15
16        if(n == 0){
17            return 1;
18        }
19        
20        double half = calculate(x, n/2);
21
22        if( n % 2 == 0){
23            return  half * half;
24        }
25        return x * half * half;
26        
27    }
28}