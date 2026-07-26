class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long total=(long)m*k;
        if(total>bloomDay.length)
        return -1;
        int left=0; int right=0;
        for(int i=0;i<bloomDay.length;i++){
            left=Math.min(left,bloomDay[i]);
            right=Math.max(right,bloomDay[i]);
        }
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int bouquets=0;
            int flowers=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    flowers++;
                    if(flowers==k){
                        bouquets++;
                        flowers=0;
                    }
                }
                    else{
                        flowers=0;
                    }
                }
            
if(bouquets>=m){
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