class Solution {
    public int dp(int i,int[] nums,int[] d,int n){
        if (nums.length == 1) {
        return nums[0];
    }
        if(i>n){
            return 0;
        }
        if(d[i]!=-1){
            return(d[i]);
        }
        int one=dp(i+1,nums,d,n);
        int two=(nums[i]+dp(i+2,nums,d,n));
        d[i]=Math.max(one,two);
        return d[i];
    }
    public int rob(int[] nums) {
        int[] d1=new int[nums.length+1];
        int[] d2=new int[nums.length+1];
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);
        return(Math.max(dp(0,nums,d1,nums.length-2),dp(1,nums,d2,nums.length-1)));
    }
}
