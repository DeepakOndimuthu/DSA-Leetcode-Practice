// Last updated: 1/25/2026, 6:20:26 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        int i =0; int j=0;
4        Arrays.sort(nums1);
5        Arrays.sort(nums2);
6        
7        List<Integer> result = new ArrayList<>();
8        while(i < nums1.length && j < nums2.length){
9            if(nums1[i] == nums2[j]){
10                if(result.isEmpty() || result.get(result.size()-1) != nums1[i]){
11                    result.add(nums1[i]);
12                }
13                i++;
14                j++;
15
16            }else if (nums1[i] < nums2[j]){
17                i++;
18            }else{
19                j++;
20            }
21        }
22        int[] ans = new int[result.size()];
23        for(int k =0; k< result.size(); k++){
24            ans[k] = result.get(k);
25        }
26        return ans;
27        
28    }
29}