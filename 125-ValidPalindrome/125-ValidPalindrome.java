// Last updated: 2/9/2026, 12:28:58 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5        while(left < right){
6
7             // skip non-alphanumeric from left
8            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
9                left++;
10            }
11            // skip non-alphanumeric from right
12             while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
13                right--;
14            }
15            // compare in lowercase
16            if(Character.toLowerCase(s.charAt(left))
17             != Character.toLowerCase(s.charAt(right))){
18                return false;
19            }
20            left++;
21            right--;
22        }
23        return true;
24        
25    }
26}
27/*
28Character.isLetterOrDigit(s.charAt(left))
29true → if character is a-z, A-Z, or 0-9
30false → if character is space or symbol
31
32while concept:
33Keep moving left pointer until we find a letter or digit.
34
35left = 0 → 'A'
36right = last index → 'a'
37toLowerCase('A') == toLowerCase('a') ✅
38*/