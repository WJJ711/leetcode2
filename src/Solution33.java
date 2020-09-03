public class Solution33 {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r){
            //如果只有两个的时候,l=mid
            int mid=(l+r)>>>1;
            if (nums[mid]==target){
                return mid;
            }
            if (mid==l){
                l++;
                continue;
            }
            //左边有序
            //如果没有=，则进入else，target<num[l]时候，结果错误
            //如果有=,l=mid+1
            if (nums[mid]>nums[l]){
                //左边
                if (target<=nums[mid]&&target>=nums[l]){
                    r=mid-1;
                }else {
                    l=mid+1;
                }
            }else {
                //右边有序
                if (target>=nums[mid]&&target<=nums[r]){
                    l=mid+1;
                }else {
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}