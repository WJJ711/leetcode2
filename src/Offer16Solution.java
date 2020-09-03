/**
 * 分治
 */
public class Offer16Solution {
    public double myPow(double x, int n) {
        long N=n;
        if (N<0){
            return 1.0/myPow(x,-N);
        }
        return myPow(x,N);
    }
    private double myPow(double x,long N){
        if (N==0){
            return 1;
        }
        if ((N&1)==1){
            double v = myPow(x, N >> 1);
            return v*v*x;
        }else {
            double v = myPow(x, N >> 1);
            return v*v;
        }
    }
}

/**
 * 非递归
 */
/*
class Solution {
    public double myPow(double x, int n) {
       long N=n;
       if (N<0){
           x=1.0/x;
           N=-N;
       }
       double res=1.0;
       while (N!=0){
           if ((N&1)==1){
               res*=x;
           }
           N>>=1;
           x*=x;
       }
       return res;
    }
}*/
