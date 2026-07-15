// Last updated: 7/15/2026, 12:02:48 PM
1class Solution {
2    public String reverseWords(String s) {
3        char [] chars = s.toCharArray();
4        reverseWords(chars, 0);
5        return new String(chars);    
6    }
7
8    public void reverseWords(char[] chars, int start){
9
10        // Base Case
11        if(start >= chars.length){
12            return;
13        }
14        int end = start;
15
16        // Find the end of the current word
17        while(end < chars.length && chars[end] != ' '){
18            end++;
19        }
20
21        // Reverse the current word
22        reverse(chars, start, end - 1);
23
24        // Recursive Call
25        reverseWords(chars, end + 1);
26    }
27
28    public void reverse(char[] chars, int left, int right){
29        while(left < right){
30            char temp = chars[left];
31            chars[left] = chars[right];
32            chars[right] = temp;
33
34            left++;
35            right--;
36        }
37    }
38}