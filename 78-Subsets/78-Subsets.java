// Last updated: 7/30/2026, 1:15:17 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(nums, 0, new ArrayList<>(), result);
5        return result;
6    }
7
8    public static void backtrack(
9        int[] nums,
10        int index, 
11        List<Integer> current, 
12        List<List<Integer>> result){
13        // Base Case
14            if(index == nums.length){
15                result.add(new ArrayList<>(current));
16                return;
17            }
18        // Include current element
19        current.add(nums[index]);
20        backtrack(nums, index+1, current, result);
21        // Backtrack
22        current.remove(current.size() - 1);
23        // Exclude current element
24        backtrack(nums, index+1, current, result);
25
26    }
27}