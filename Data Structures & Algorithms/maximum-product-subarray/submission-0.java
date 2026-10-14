class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int prevMin = min;
            int prevMax = max;

            if (num < 0) {
                int temp = prevMax;
                prevMax = prevMin;
                prevMin = temp;
            }

            max = Math.max(num, prevMax * num);
            min = Math.min(num, prevMin * num);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}