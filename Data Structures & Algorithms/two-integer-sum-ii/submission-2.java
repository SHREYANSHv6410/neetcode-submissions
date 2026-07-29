class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int temp=target-(numbers[left]+numbers[right]);
            if(temp>0){
                left++;
            }
            else if(temp<0){
                right--;
            }
            else if(temp==0){
                break;
            }
        }
        int[] sol=new int[2];
        sol[0]=left+1;
        sol[1]=right+1;
        return sol;
    }
}
