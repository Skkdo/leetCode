class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }
            prices[i] -= min;
        }

        for(int price : prices) {
            if(price > max) max = price;
        }

        return max;
    }
}