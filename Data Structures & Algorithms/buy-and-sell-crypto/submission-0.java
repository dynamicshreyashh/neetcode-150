class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if(n <= 1) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=1; i<n; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int currProfit = prices[i] - minPrice;
                if(currProfit > maxProfit){
                    maxProfit = currProfit;
                }
            }
        }

        return maxProfit;
    }
}
