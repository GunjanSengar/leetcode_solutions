class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
        if(num%2==0){
            num=num/2;
            step=step+1;
        }
      else  if(num%2!=0){
            num=num-1;
            step=step+1;
        }
        }
            return step;

        
    }
}