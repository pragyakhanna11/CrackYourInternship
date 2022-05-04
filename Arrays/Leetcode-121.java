class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int ans = 0;
        for (int i = 1; i<prices.length; i++){
            if((prices[i]>max)&&(prices[i]-min>ans)){
                max = prices[i];
                ans = max-min;
            }
            else if(prices[i]<min){
                max= prices[i];
                min = prices[i];
            }
        }
        return ans;
    }
}
