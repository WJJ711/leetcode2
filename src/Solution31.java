import java.util.Arrays;

public class Solution31 {
    public  void nextPermutation(int[] nums) {
        if (nums.length<=1){
            return;
        }
         int i=nums.length-2;
       for (;i>=0;i--){
           if (nums[i+1]>nums[i]){
               break;
           }
       }
        if (i==-1){
            Arrays.sort(nums);
            return;
        }
       int j=nums.length-1;
       for (;j>i;j--){
           if (nums[j]>nums[i]){
               break;
           }
       }

       swap(nums,i,j);
       Arrays.sort(nums,i+1,nums.length);
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}