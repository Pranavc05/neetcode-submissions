class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // left is buying
        int right =  1; // right is selling 
        int maxprofit = 0;
        while(right < prices.length){
            if(prices[left] < prices[right] ){
                int profit = prices[right] - prices[left];
                maxprofit = Math.max(maxprofit, profit);
            } else{
                left = right;
            }
            right++;
        }
        return maxprofit;
    }
}
