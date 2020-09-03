public class Solution81 {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int mid=(l+r)>>>1;
            if (nums[mid]==target){
                return true;
            }
            if (nums[l]==nums[mid]){
                l++;
                continue;
            }
            if (nums[mid]>nums[l]){
                //左边连续
                if (target<nums[mid]&&target>=nums[l]){
                    r=mid-1;
                }else {
                    l=mid+1;
                }
            }else {
                //右边连续
                if (target>=nums[mid]&&target<=nums[r]){
                    l=mid+1;
                }else {
                    r=mid-1;
                }
            }

        }
        return false;
    }
}