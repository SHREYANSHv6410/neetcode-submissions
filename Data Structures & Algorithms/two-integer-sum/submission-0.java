class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] sol=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                sol[0]=(map.get(nums[i]));
                sol[1]=(i);
                return sol;
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        return sol;
    }
}
