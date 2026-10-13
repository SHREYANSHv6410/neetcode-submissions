class Solution {
    public int solve(int[] coins, int amount,HashMap<Integer,Integer> map){
        if(map.containsKey(amount)){
            return map.get(amount);
        }
        if(amount==0)return 0;
        if(amount<0)return Integer.MAX_VALUE/2;
        int min=Integer.MAX_VALUE/2;
        int rem=amount;
        for(int coin:coins){
            min=Math.min(min,1+solve(coins,amount-coin,map));
        }
        map.put(amount,min);
        return min;
    }
    public int coinChange(int[] coins, int amount) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sol=solve(coins,amount,map);
        if(sol>=Integer.MAX_VALUE/2){
            return -1;
        }
        return sol;
    }
    
}
