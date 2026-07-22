// Last updated: 7/22/2026, 11:54:14 AM
1class NumArray {
2    private int [] nums;
3
4    public NumArray(int[] nums) {
5        this.nums = nums;
6        
7    }
8    
9    public int sumRange(int left, int right) {
10
11        // Base Case
12        if(left > right){
13            return 0;
14        }
15
16        // Recursive Call
17        return nums[left] + (sumRange(left+1, right));
18        
19    }
20}
21
22/**
23 * Your NumArray object will be instantiated and called as such:
24 * NumArray obj = new NumArray(nums);
25 * int param_1 = obj.sumRange(left,right);
26 */