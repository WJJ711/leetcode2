import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*
class Solution {
    public int[] dailyTemperatures(int[] T) {
        //记录某个元素第一次出现的位置
        int[] next=new int[101];
        int[] res=new int[T.length];
        Arrays.fill(next,Integer.MAX_VALUE);
        for (int i=T.length-1;i>=0;i--){
            int temp=Integer.MAX_VALUE;
            for (int t=T[i]+1;t<=100;t++){
                temp=Math.min(temp,next[t]);
            }
            if (temp!=Integer.MAX_VALUE){
                res[i]=temp-i;
            }
            next[T[i]]=i;
        }
        return res;
    }
}*/
public class Solution739 {
    public int[] dailyTemperatures(int[] T) {
        Deque<Integer> stack=new LinkedList<>();
        int[] ans=new int[T.length];
        for (int i=0;i<T.length;i++){
            while (!stack.isEmpty()&&T[i]>T[stack.peekLast()]){
                Integer pre = stack.pollLast();
                ans[pre]=i-pre;
            }
            stack.addLast(i);
        }
        return ans;
    }
}