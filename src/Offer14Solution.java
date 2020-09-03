/**
 * dp
 */
public class Offer14Solution {
    public int cuttingRope(int n) {
        if(n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        if (n==3){
            return 2;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for (int i=4;i<=n;i++){
            int max=0;
            for (int j=1;j<=i/2;j++){
                max=Math.max(max,dp[i-j]*dp[j]);
            }
            dp[i]=max;
        }
        return dp[n];
    }
}