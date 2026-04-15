class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int smallestNum = prices[0];

        for(int price : prices){
            if(smallestNum > price){
                smallestNum = price;
            }
            else if(maxProfit < price - smallestNum){
                maxProfit = price - smallestNum;
            }
        }
        return maxProfit;

    }
}
