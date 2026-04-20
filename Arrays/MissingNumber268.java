class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
    int currentSum=0;
    for(int i=0;i<n;i++){
        currentSum+=nums[i];
    }
    int actualSum=expectedSum-currentSum;
    return actualSum;    
    }

}