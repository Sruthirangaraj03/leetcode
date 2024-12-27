class Solution {
    public int maxProfit(int[] prices) {
    int min=prices[0],diff=0,max=0;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        diff=prices[i]-min;
        if(diff>max){
            max=diff;
        }
    }
    return max;
    }
}