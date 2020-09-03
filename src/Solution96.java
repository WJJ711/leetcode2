public class Solution96 {
    //g(n)代表结果
    //f(n,i)表示，第i个位根节点有多少种
    public int numTrees(int n) {
        int[] g=new int[n+1];
        g[0]=1;
        g[1]=1;
        for (int i=2;i<=n;i++){
            int res=0;
            for (int j=1;j<=i;j++){
                res+=g[j-1]*g[i-j];
            }
            g[i]=res;
        }
        return g[n];
    }
}