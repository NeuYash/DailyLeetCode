Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int lowBuyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>lowBuyPrice){
                profit+=prices[i]-lowBuyPrice;
            }
            lowBuyPrice=prices[i];
        }
        return profit;
    }
}