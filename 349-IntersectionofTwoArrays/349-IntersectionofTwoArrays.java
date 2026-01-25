// Last updated: 1/25/2026, 6:18:37 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m -1; // pointer for nums1
4        int j = n -1;  // pointer for nums2
5        int k  = m+n -1; // pointer for merged array
6
7        while(i>=0 && j>=0){
8            if(nums1[i] > nums2[j]){
9                nums1[k] = nums1[i];
10                i--;
11            }else{
12                nums1[k] = nums2[j];
13                j--;
14            }
15            k--;
16        }
17
18        // copy remaining nums2 elements if any
19        while(j>=0){
20            nums1[k] = nums2[j];
21            j--;
22            k--;
23        }
24    }
25}
26/*
27Notes:
28[1,2,3,0,0,0]
29[1,2,3,?, ?, ?]
30[1,2,3,0,0,6]
31
32nums1 = [?, ?, ?, ?, ?, ?]
33nums2 = [2,5,6]
34*/
35
36
37