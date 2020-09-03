import java.math.BigDecimal;

public class Offer14_2Solution {
    public int cuttingRope(int n) {
        if (n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        if (n==3){
            return 2;
        }
        BigDecimal[] dp=new BigDecimal[n+1];
        dp[0]=new BigDecimal("1");
        dp[1]=new BigDecimal("1");
        dp[2]=new BigDecimal("2");
        dp[3]=new BigDecimal("3");
        for (int i=4;i<=n;i++){
            BigDecimal max=new BigDecimal("0");
            for (int j=1;j<=i/2;j++){
                max=max.max(dp[j].multiply(dp[i-j]));
            }
            dp[i]=max;
        }
        return dp[n].remainder(new BigDecimal("1000000007")).intValue();
    }
}