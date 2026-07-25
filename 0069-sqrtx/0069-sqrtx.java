class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        } int left=0; int right=x;
        int result=0;
        while(left<=right){
            int mid=(left+right)/2;
            long square=(long)mid*mid;
            if(square==x){
                return mid;
            } else if(square<x){
                result=mid;
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }
        return result;
        
    }
}