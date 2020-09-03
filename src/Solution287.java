

public class Solution287 {
    public int findDuplicate(int[] nums) {
        int l = 1, r = nums.length - 1;
        while (l<r){
            int mid=(l+r)>>>1;
            int count=0;
            for (int num : nums) {
                if (num<=mid){
                    count++;
                }
            }
            if (count>mid){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        return l;
    }
}