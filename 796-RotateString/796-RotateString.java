// Last updated: 2/11/2026, 4:23:45 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3
4        // step 1: length must be same
5        if(s.length() != goal.length()){
6            return false;
7        }
8        // step 2: concatenate string
9        String doubled = s + s;
10        //System.out.println(doubled);
11        
12        // step 3: check goal exists inside doubled string
13        return doubled.contains(goal);
14        
15    }
16}