// Last updated: 7/14/2026, 11:17:15 AM
1class Solution {
2    public String reverseStr(String s, int k) {
3        char [] chars = s.toCharArray();
4        reverse(chars, 0, k);
5        return new String(chars);
6    }
7
8    public void reverse(char [] chars, int start, int k){
9
10        if( start >= chars.length){
11            return;
12        }
13
14        int left = start;
15        int right = Math.min(start + (k - 1) , chars.length - 1);
16
17        while (left < right){
18            char temp = chars[left];
19            chars[left] = chars[right];
20            chars[right] = temp;
21
22            left++;
23            right--;
24        }
25
26        reverse(chars, start + (2 *k), k);
27        
28    }
29}