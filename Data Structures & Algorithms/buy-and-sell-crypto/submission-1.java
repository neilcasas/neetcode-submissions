class Solution {
    public int maxProfit(int[] prices) {
        // initialize startPtr to 0th index
        int startPtr = 0;
        // initialize endPtr to 1
        int endPtr = 1;
        // initialize profit to 0
        int profit = 0;
        // initialize current profit to 0
        int currentProfit = 0;

         while (endPtr < prices.length) {
            if(prices[startPtr] > prices[endPtr]) {
                startPtr = startPtr + 1;
            } else {
                currentProfit = prices[endPtr] - prices[startPtr];
                profit = currentProfit > profit ? currentProfit : profit;
                endPtr = endPtr + 1;
            }
         }
         return profit;
    }
}
