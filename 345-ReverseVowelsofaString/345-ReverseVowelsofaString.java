// Last updated: 1/29/2026, 4:39:50 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] arr = s.toCharArray();
4        int left = 0;
5        int right  = arr.length - 1;
6
7        while(left < right){
8            while(left < right && !isVowle(arr[left])){
9                left++;
10            }
11            while(left < right && !isVowle(arr[right])){
12                right--;
13            }
14            char temp = arr[left];
15            arr[left] =  arr[right];
16            arr[right] = temp;
17            left++;
18            right--;
19        }
20
21        return new String(arr);
22        
23    }
24
25    private static boolean isVowle(char ch){
26        ch =  Character.toLowerCase(ch);
27        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
28    }
29}