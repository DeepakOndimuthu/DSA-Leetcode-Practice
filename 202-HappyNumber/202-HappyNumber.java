// Last updated: 6/24/2026, 4:10:02 PM
1class Solution {
2
3    public static int getNext(int n){
4        int sum = 0;
5        while(n > 0){
6            int digit = n % 10;
7            sum += digit * digit;
8            n /= 10;
9        }
10        return sum;
11    }
12    public boolean isHappy(int n) {
13
14        int slow = n;
15        int fast = n;
16        do{
17
18            slow = getNext(slow);
19            fast = getNext(getNext(fast));
20
21        }while( slow != fast);
22        return slow == 1;
23        
24    }
25}