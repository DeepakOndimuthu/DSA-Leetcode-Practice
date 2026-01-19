// Last updated: 1/19/2026, 8:59:38 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice = Integer.MAX_VALUE;
4        int maxPrice = 0;
5
6        for(int price: prices){
7            if(price < minPrice){
8                minPrice = price;
9            }else{
10                int profit = price - minPrice;
11                if(profit > maxPrice){
12                    maxPrice = profit;
13                }
14            }
15
16        }
17        return maxPrice;
18        
19        
20    }
21}