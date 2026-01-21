// Last updated: 1/21/2026, 4:44:54 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy1 = Integer.MAX_VALUE;
4        int sell1 = 0;
5        int buy2 = Integer.MAX_VALUE;
6        int sell2 =0;
7        //System.out.println(buy1);
8        for(int price: prices){
9            buy1 = Math.min(buy1,price);
10            sell1 = Math.max(sell1, price - buy1);
11
12            buy2 = Math.min(buy2,price - sell1);
13            sell2 = Math.max(sell2, price - buy2);
14            
15        }
16
17        return sell2;
18        
19    }
20}