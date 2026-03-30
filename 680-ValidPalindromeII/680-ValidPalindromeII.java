// Last updated: 3/30/2026, 1:12:57 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3        int left = 0;
4        int right =  s.length() - 1;
5
6        while(left < right){
7            if(s.charAt(left)  != s.charAt(right)){
8
9               return isPalindrome(s, left + 1, right) || 
10                isPalindrome(s, left, right -1);
11                         
12            }
13            left++;
14            right--;
15        }
16        return true;
17        
18    }
19    public boolean isPalindrome(String s, int left, int right){
20        while(left < right){
21
22            if(s.charAt(left)  != s.charAt(right)){
23            return false;
24            }
25            left++;
26            right--;
27        }
28        
29        return true;
30    }
31}