//Sliding Window Problem - EASY - 01
// Leetcode 121 - Best Time to buy and sell Stock

// Approach 01
class Solution {
    public int maxProfit(int[] prices) {
        
        int windowBuy = 0; //WindowStart
        int maxProfit = 0;

        for(int windowSell=1; windowSell<prices.length; windowSell++){
            //Fetch the first element
            if(price[windowSell] < price[windowBuy]){
                windowBuy = windowSell;
            }else{
                int currentProfit = price[windowSell] - price[windowBuy];
                maxProfit = Math.max(maxProfit, currentProfit);
            } 
            return maxProfit;
        }

        return maxValue;
    }
}

//Approach 02
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i =1; i<prices.length; i++){
            if(buyPrice<prices[i]){
                profit=Math.max(profit, prices[i]-buyPrice);
            }else{
                buyPrice=prices[i];
            }
        }
        return profit;
    }
}