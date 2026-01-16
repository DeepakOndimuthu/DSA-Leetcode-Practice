// Last updated: 1/16/2026, 8:04:27 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3       
4        int first =findFirst(nums, target);
5        int second = findSecond(nums, target);
6        return new int []{first,second};
7    }
8
9    private static int findFirst(int[] nums, int target){
10        int left = 0;
11        int right = nums.length -1;
12        //System.out.println("right : "+ right);
13        int result = -1;
14
15        while(left <= right){
16            int mid = left + (right -left)/2;
17            //System.out.println("mid : "+ mid);
18            if(nums[mid] == target){
19                result = mid;
20                right = mid -1; //// move left
21            }else if (nums[mid] < target){
22                left= mid + 1;
23            }else{
24                right = mid - 1;
25            }
26            //return result;
27        }
28        return result;
29    }
30
31    private static int findSecond(int[] nums, int target){
32         int left = 0;
33        int right = nums.length -1;
34        //System.out.println("right : "+ right);
35        int result = -1;
36
37        while(left <= right){
38            int mid = left + (right -left)/2;
39            //System.out.println("mid : "+ mid);
40            if(nums[mid] == target){
41                result = mid;
42                left = mid + 1; // move right
43            }else if (nums[mid] < target){
44                left= mid + 1;
45            }else{
46                right = mid - 1;
47            }
48            //return result;
49        }
50        return result;
51
52    }
53
54
55}