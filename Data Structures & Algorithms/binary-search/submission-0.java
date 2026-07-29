class Solution {
    public int search(int[] nums, int target) {
        int right=nums.length-1,left=0,mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
        }
        return -1;
    }
}
