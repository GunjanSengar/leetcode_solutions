class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int left=0;
         int right=cols-1;
         while(left<=right){
            int mid=left+(right-left)/2;
            int maxRows=0;
            for(int i=1;i<rows;i++){
                if(mat[i][mid]>mat[maxRows][mid]){
                    maxRows=i;
                }
            }
            int leftValue=(mid==0)? -1: mat[maxRows][mid-1];
            int rightValue=(mid==cols-1)?-1: mat[maxRows][mid+1];
            if(mat[maxRows][mid]>leftValue && mat[maxRows][mid]>rightValue){
                return new int[]{maxRows,mid};
            } else if(leftValue>mat[maxRows][mid]){
                right=mid-1;
            } else{
                left=mid+1;
            }
         }
         return new int[]{-1,-1};
        
    }
}