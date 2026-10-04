class Solution {
    
    public int dp(int i,int[] nums,int[] memo){
        if(i>=nums.length){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        memo[i]=Math.max((nums[i]+dp(i+2,nums,memo)),dp(i+1,nums,memo));
        return memo[i];
    }
    public int rob(int[] nums) {
        int[] memo=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return dp(0,nums,memo);
    }
}
