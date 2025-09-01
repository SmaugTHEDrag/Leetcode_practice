class Solution {
    public int maxProfit(int[] prices) {
        int minIndex = prices[0];
        int maxProfit = 0;
        for(int i = 1 ; i< prices.length ; i++){
            if(minIndex>prices[i]){
                minIndex = prices[i];
            }
            else if(minIndex<prices[i]){
                int profit = prices[i] - minIndex;
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}