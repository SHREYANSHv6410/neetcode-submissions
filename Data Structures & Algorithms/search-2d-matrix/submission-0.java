class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length,col=matrix[0].length;
        int right=row*col-1,left=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int r=mid/col,c=mid%col;
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]>target){
                right=mid-1;
            }
            else if(matrix[r][c]<target){
                left=mid+1;
            }
        }
        return false;
    }
}
