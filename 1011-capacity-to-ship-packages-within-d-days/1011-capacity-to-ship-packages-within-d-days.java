class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0; int right=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int currentWeight=0;
            int requiredDays=1;
            for(int i=0;i<weights.length;i++){
                if(currentWeight+weights[i]<=mid){
                    currentWeight+=weights[i];

                } else{
                    requiredDays++;
                    currentWeight=weights[i];
                }
            }
            if(requiredDays<=days){
                ans=mid;
                right=mid-1;

            } else{
            left=mid+1;

        }
        }
return ans;
        
    }
}