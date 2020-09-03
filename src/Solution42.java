/*
class Solution {
    public int trap(int[] height) {
        int sum=0;
        //最两端的列不用考虑,因为一定不会有水
        for (int i=1;i<height.length;i++){
            int max_left=0;
            //找出左边最高
            for (int j=i-1;j>=0;j--){
                max_left=Math.max(max_left,height[j]);
            }
            int max_right=0;
            for (int j=i+1;j<height.length;j++){
                max_right=Math.max(max_right,height[j]);
            }
            //找出两端最小的
            int min=Math.min(max_left,max_right);
            //只有较小的一段大于当前列的高度才会有水
            if (min>height[i]){
                sum+=(min-height[i]);
            }
        }
        return sum;
    }
}*/
public class Solution42 {
    public int trap(int[] height) {
        int sum=0;
        int[] max_left=new int[height.length];
        int[] max_right=new int[height.length];
        for (int i=1;i<height.length-1;i++){
            max_left[i]=Math.max(max_left[i-1],height[i-1]);
        }
        for (int i=height.length-2;i>=0;i--){
            max_right[i]=Math.max(max_right[i+1],height[i+1]);
        }
        for (int i=1;i<height.length-1;i++){
            int min=Math.min(max_left[i],max_right[i]);
            if (min>height[i]){
                sum+=(min-height[i]);
            }
        }
        return sum;

    }
}