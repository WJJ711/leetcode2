
public class Offer10_1_Solution {
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int pre=1;
        int prepre=0;
        for (int i=1;i<n;i++){
            int temp=pre;
            pre=(prepre+pre)%1000000007;
            prepre=temp;
        }
        return pre;
    }
}