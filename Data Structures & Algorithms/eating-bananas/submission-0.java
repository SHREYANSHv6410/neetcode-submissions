class Solution {
    public boolean works(int[] piles,int n,int total){
        double sum=0.0;
        for(int num:piles){
            sum=sum+Math.ceil((double)num/n);
        }
        if(sum<=total){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1,min=999;
        int total=0;
        for(int n=0;n<piles.length;n++){
            if(piles[n]>max){
                max=piles[n];
            }
            total+=piles[n];
        }
        int left=1,right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(works(piles,mid,h)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
