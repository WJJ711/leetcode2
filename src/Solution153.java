public class Solution153 {
    public static int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while (l<r){
            //mid=l时候
            int mid=(l+r)>>>1;
            if (nums[mid]<nums[r]){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int[] a={3,1,2};
        System.out.println(findMin(a));
    }
}