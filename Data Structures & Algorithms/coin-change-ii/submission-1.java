class Solution {
    public int count(int amount,int[] coins,int index,int[][] dp){
        if(amount==0){
            return 1 ;
        }
        if(amount<0 || index==coins.length){
            return 0;
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int take=count(amount-coins[index],coins,index,dp);
        int skip=count(amount,coins,index+1,dp);
        dp[index][amount]=take+skip;
        return dp[index][amount];
    }
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return count(amount,coins,0,dp);
    }
}
