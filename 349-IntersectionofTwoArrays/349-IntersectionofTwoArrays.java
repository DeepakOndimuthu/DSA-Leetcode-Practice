// Last updated: 1/23/2026, 1:54:16 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3         int i =0; int j=0;
4        Arrays.sort(nums1);
5        Arrays.sort(nums2);
6        
7        List<Integer> result = new ArrayList<>();
8        while(i < nums1.length && j < nums2.length){
9            if(nums1[i] == nums2[j]){
10                result.add(nums1[i]);
11                i++;
12                j++;
13
14            }else if (nums1[i] < nums2[j]){
15                i++;
16            }else{
17                j++;
18            }
19        }
20        int[] ans = new int[result.size()];
21        for(int k =0; k< result.size(); k++){
22            ans[k] = result.get(k);
23        }
24        return ans;
25        
26    }
27}