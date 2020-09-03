public class Offer_13_Solution {
    int n,m;
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        this.m=m;
        this.n=n;
        visited=new boolean[m][n];
        return dfs(0,0,k);
    }
    private int dfs(int i,int j,int k){
        if (k<helper(i,j)||i>=m||j>=n||visited[i][j]){
            return 0;
        }
        visited[i][j]=true;
        return 1+dfs(i+1,j,k)+dfs(i,j+1,k);
    }
    private int helper(int m,int n){
        int res=0;
        while (m!=0){
            res+=m%10;
            m/=10;
        }
        while (n!=0){
            res+=n%10;
            n/=10;
        }
        return res;
    }
}