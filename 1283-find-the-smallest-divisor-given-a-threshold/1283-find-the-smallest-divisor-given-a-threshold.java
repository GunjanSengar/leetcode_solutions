class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int i=0;i<nums.length;i++){
            right=Math.max(right,nums[i]);
        }
       int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
                    int sum=0;

            for(int i=0;i<nums.length;i++){
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            
        }
        return ans;
 
    }
}