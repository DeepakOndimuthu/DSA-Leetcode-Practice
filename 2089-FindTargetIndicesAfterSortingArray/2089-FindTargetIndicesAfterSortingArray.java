// Last updated: 1/15/2026, 11:52:29 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3
4        // step 1: sort array
5        Arrays.sort(nums);
6        //System.out.println(Arrays.toString(nums));
7
8        // step 2: store result
9        List<Integer> result = new ArrayList<>();
10
11       // step 3: find target indices
12        for(int i = 0; i < nums.length ; i++){
13            if(nums[i] == target){
14                result.add(i);
15            }
16        }
17        return  result;
18        
19    }
20}