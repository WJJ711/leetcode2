public class Solution1312 {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp=new int[n][n];
        for (int i=1;i<n;i++){
            for (int j=i-1;j>=0;j--){
                if (s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i-1][j+1];
                }else {
                    dp[i][j]=Math.min(dp[i][j+1],dp[i-1][j])+1;
                }
            }
        }
        return dp[n-1][0];
    }
}