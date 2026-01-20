// Last updated: 1/20/2026, 8:47:10 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int profit  = 0;
5        for(int i =1; i<prices.length;i++){
6            if(prices[i] > prices[i-1]){
7                profit += prices[i] - prices[i-1];
8            }
9        }
10        return profit;
11    }
12}