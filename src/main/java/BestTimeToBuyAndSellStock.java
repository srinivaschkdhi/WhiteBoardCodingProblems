
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
       int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minVal) {//if it is min value . buy it . we dont sell .
                minVal = prices[i];
            } else {// if it  is not min value . we already might bought for min value. we try to sell for the price .
                int curProfit = prices[i] - minVal;
                maxProfit = Math.max(curProfit,maxProfit);
            }
        }
      
        return maxProfit;
    }
}
