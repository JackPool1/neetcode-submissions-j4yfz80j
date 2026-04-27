class Solution {
    public int maxProfit(int[] prices) {
        int least = prices[0];

        int maxProfit = 0;
        for(int price : prices){
            least = Math.min(price, least);

            maxProfit = Math.max(maxProfit,price - least);
        }

        return maxProfit;
    }
}
