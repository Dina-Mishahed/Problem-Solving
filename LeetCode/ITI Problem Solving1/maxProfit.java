class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<l; i++) 
        {
            if(prices[i]-minPrice > maxProfit)
                maxProfit =prices[i]-minPrice;
            if(minPrice > prices[i])
                minPrice = prices[i];
        }
        return maxProfit;
    }
} 