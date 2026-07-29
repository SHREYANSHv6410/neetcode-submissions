class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=1;
        int max=0;
        for(right=1;right<prices.length;right++){
            if(prices[left]>prices[right]){
                left=right;
            }
            else if(prices[left]<=prices[right]){
                int temp=prices[right]-prices[left];
                if(max<temp){
                    max=temp;
                }
            }
        }
        return max;
    }
}
