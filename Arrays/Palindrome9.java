class Solution {
    public boolean isPalindrome(int x) {
                int rem=0;
if(x<0) 
return false;
int x1=x;
        while(x!=0){
        int n=x%10;
        rem=rem*10+n;
        x=x/10;

        }
        return x1==rem;


    }


}