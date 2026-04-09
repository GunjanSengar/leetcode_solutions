// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
//         int n=cardPoints.length;
//         int leftSum=0;
//         for(int i=0;i<k;i++){
//             leftSum+=cardPoints[i];
//         }
//         int maxSum=leftSum;
//         int rightSum=0;
//         for(int i=1;i<=k;i++){
//             leftSum-=cardPoints[k-i];
//             rightSum+=cardPoints[n-i];
//             maxSum=Math.max(maxSum,leftSum+rightSum);
//         }
//         return maxSum;
        
//     }
//}

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int totalSum=0;
        for(int nums: cardPoints){
            totalSum=totalSum+nums;
        }
        if(k==n){
            return totalSum;
        }
        int windowSize=n-k;
        int windowSum=0;
        for(int i=0;i<windowSize;i++){
            windowSum+=cardPoints[i];
        }
        int minSum=windowSum;
        for(int i=windowSize;i<n;i++){
            windowSum+=cardPoints[i];
            windowSum-=cardPoints[i-windowSize];
            minSum=Math.min(minSum,windowSum);
        }
        return totalSum-minSum;
    }




    }