class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int l=right-left;
            int area=h*l;
            if(max<area){
                max=area;
            }
            if(heights[left]<=heights[right]){
                left++;
            }
            else if(heights[left]>heights[right]){
                right--;
            }
        }
        return max;
    }
}
