class Solution {
    public int divide(int dividend, int divisor) {
       if(dividend==(1<<31)&& (divisor==-1)){
           return Integer.MAX_VALUE;
       }
       boolean sign = (dividend>=0)==(divisor>=0) ? true : false;
       dividend=Math.abs(dividend);
       divisor=Math.abs(divisor);
       int result=0;
       while(dividend-divisor>=0){
           int count=0;
           while(dividend-(divisor<<1<<count)>=0){
               count++;
           }
           result+=1<<count;
           dividend-=divisor<<count;
       }
       return sign?result:-result; 
    }
}
/**steps that we are following
 1. while we can subtract divisor from dividend
 			1.if yes then we double the divisor
			2.increment the count
			3.check again
			
2.add the count to result
3.subtract the temporary variable from result



<< means that the left-hand operand is multiplied by 2, for as many times as the number in the right-hand operand. E.g. 1 << 3 means 1*2*2*2. – ==1.
 */