class Solution {
    public double myPow(double x, int n) {
     double result=1;
     long b = Math.abs((long)n);// given condition is -231 <= n <= 231-1

     while(b>0){
         if((b&1)==1){//equal to b%2==1
             result*=x;
         }
         x*=x;
         b>>=1;//equal b=b/2;
     }
     return n<0?1/result:result;    
    }
}
/** class Solution {
    public double myPow(double x, int n) {
     double result=1;
     long b = Math.abs((long)n);
     while(b>0){
         if((b%2)==1){
             result*=x;
         }
         x*=x;
         b/=2;
     }
     return n<0?1/result:result;    
    }
}*/