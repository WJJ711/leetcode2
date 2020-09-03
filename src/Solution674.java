public class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int[] dp=new int[nums.length];
        int max=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }
            max=Math.max(dp[i],max);
        }
        return max+1;
    }
}